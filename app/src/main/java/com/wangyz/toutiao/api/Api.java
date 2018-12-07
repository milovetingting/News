package com.wangyz.toutiao.api;

import com.wangyz.toutiao.ConstantValue;
import com.wangyz.toutiao.bean.model.News;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * @author wangyz
 * Api
 */
public interface Api {

    @GET(ConstantValue.API_NEWS)
    Observable<News> loadNews(@Header("Authorization") String authorization, @Query("type") String type);

}
