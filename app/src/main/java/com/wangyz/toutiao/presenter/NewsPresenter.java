package com.wangyz.toutiao.presenter;

import com.blankj.utilcode.util.LogUtils;
import com.wangyz.toutiao.base.BasePresenter;
import com.wangyz.toutiao.bean.db.News;
import com.wangyz.toutiao.contract.Contract;
import com.wangyz.toutiao.model.NewsModel;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author wangyz
 * NewsPresenter
 */
public class NewsPresenter extends BasePresenter<Contract.NewsView> implements Contract.NewsPresenter {

    private static final String TAG = NewsPresenter.class.getSimpleName();

    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    private Contract.NewsModel mModel;

    public NewsPresenter() {
        mModel = new NewsModel();
    }

    @Override
    protected void detachView() {
        super.detachView();
        mCompositeDisposable.clear();
    }

    @Override
    public void initLoad(String type) {
        mModel.initLoad(type).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<News>>() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(List<News> list) {
                getView().onInitLoad(list);
            }

            @Override
            public void onError(Throwable e) {
                LogUtils.iTag(TAG, "onError:" + e.getMessage());
                getView().onLoadFailed(e);
            }

            @Override
            public void onComplete() {
                LogUtils.iTag(TAG, "onComplete");
            }
        });
    }

    @Override
    public void loadNews(String type) {
        mModel.loadNews(type).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<News>>() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(List<News> list) {
                getView().onLoadNews(list);
            }

            @Override
            public void onError(Throwable e) {
                LogUtils.iTag(TAG, "onError:" + e.getMessage());
                getView().onLoadFailed(e);
            }

            @Override
            public void onComplete() {
                LogUtils.iTag(TAG, "onComplete");
            }
        });
    }

    @Override
    public void loadMore(String type, int offset, int limit) {
        mModel.loadMore(type, offset, limit).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<List<News>>() {
            @Override
            public void onSubscribe(Disposable d) {
                mCompositeDisposable.add(d);
            }

            @Override
            public void onNext(List<News> list) {
                getView().onLoadMore(list);
            }

            @Override
            public void onError(Throwable e) {
                LogUtils.iTag(TAG, "onError:" + e.getMessage());
                getView().onLoadFailed(e);
            }

            @Override
            public void onComplete() {
                LogUtils.iTag(TAG, "onComplete");
            }
        });
    }
}
