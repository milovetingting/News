package com.wangyz.toutiao.model;

import android.annotation.TargetApi;
import android.os.Build;

import com.blankj.utilcode.util.LogUtils;
import com.wangyz.toutiao.ConstantValue;
import com.wangyz.toutiao.api.Api;
import com.wangyz.toutiao.bean.db.News;
import com.wangyz.toutiao.contract.Contract;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author wangyz
 * NewsModel
 */
public class NewsModel implements Contract.NewsModel {

    private static final String TAG = NewsModel.class.getSimpleName();

    @Override
    public Observable<List<News>> initLoad(String type) {
        Observable<List<News>> loadMore = Observable.create(emitter -> {
            List<News> list = LitePal.where("category=?", type).order("id desc").offset(0).limit(10).find(News.class);
            if (list != null && list.size() > 0) {
                LogUtils.iTag(TAG, "load data from local");
                emitter.onNext(list);
            } else {
                emitter.onComplete();
            }
        });
        Observable<List<News>> loadNews = doLoadNews(type);
        return Observable.concat(loadMore, loadNews);
    }

    @Override
    public Observable<List<News>> loadNews(String type) {
        return doLoadNews(type);
    }

    @Override
    public Observable<List<News>> loadMore(String type, int offset, int limit) {
        return doLoadMore(type, offset, limit);
    }

    @TargetApi(Build.VERSION_CODES.N)
    private Observable<List<News>> doLoadNews(String type) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ConstantValue.API_URL).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        Api api = retrofit.create(Api.class);
        return api.loadNews("APPCODE " + ConstantValue.APP_CODE, type).filter(n -> n.getError_code() == 0).map(n -> {
            LogUtils.iTag(TAG, "load data from network");
            List<News> all = LitePal.findAll(News.class);
            List<News> list = new ArrayList<>();
            n.getResult().getData().stream().forEach(d -> {
                long count = all.stream().filter(m -> m.uniquekey.equals(d.getUniquekey())).count();
                if (count <= 0) {
                    News model = new News();
                    model.author_name = d.getAuthor_name();
                    model.category = type;
                    model.date = d.getDate();
                    model.thumbnail_pic_s = d.getThumbnail_pic_s();
                    model.thumbnail_pic_s02 = d.getThumbnail_pic_s02();
                    model.thumbnail_pic_s03 = d.getThumbnail_pic_s03();
                    model.title = d.getTitle();
                    model.uniquekey = d.getUniquekey();
                    model.url = d.getUrl();
                    list.add(model);
                }
                Collections.reverse(list);
            });
            LitePal.saveAll(list);
            Collections.reverse(list);
            return list;
        });
    }

    private Observable<List<News>> doLoadMore(String type, int offset, int limit) {
        return Observable.create(emitter -> {
            List<News> list = LitePal.where("category=?", type).order("id desc").offset(offset).limit(limit).find(News.class);
            LogUtils.iTag(TAG, "load data from local");
            emitter.onNext(list);
            emitter.onComplete();
        });
    }
}
