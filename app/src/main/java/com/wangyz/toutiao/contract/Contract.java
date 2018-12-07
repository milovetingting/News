package com.wangyz.toutiao.contract;


import com.wangyz.toutiao.bean.db.News;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author wangyz
 * 接口类
 */
public class Contract {

    /**
     * MainModel
     */
    public interface MainModel {

    }

    /**
     * MainView
     */
    public interface MainView {

    }

    /**
     * MainPresenter
     */
    public interface MainPresenter {

    }

    /**
     * NewsModel
     */
    public interface NewsModel {

        /**
         * 页面打开时首次加载
         *
         * @param type
         * @return
         */
        Observable<List<News>> initLoad(String type);

        /**
         * 加载新闻
         *
         * @param type
         * @return
         */
        Observable<List<News>> loadNews(String type);

        /**
         * 从数据库加载更多新闻
         *
         * @param type
         * @param offset
         * @param limit
         * @return
         */
        Observable<List<News>> loadMore(String type, int offset, int limit);
    }

    /**
     * NewsView
     */
    public interface NewsView {

        /**
         * 加载失败
         *
         * @param e
         */
        void onLoadFailed(Throwable e);

        /**
         * 页面打开时首次加载完成
         *
         * @param list
         */
        void onInitLoad(List<News> list);

        /**
         * 加载新闻完成
         *
         * @param list
         */
        void onLoadNews(List<News> list);

        /**
         * 从数据库加载更多新闻完成
         *
         * @param list
         */
        void onLoadMore(List<News> list);
    }

    /**
     * NewsPresenter
     */
    public interface NewsPresenter {

        /**
         * 页面打开时首次加载
         *
         * @param type
         */
        void initLoad(String type);

        /**
         * 加载新闻
         *
         * @param type
         */
        void loadNews(String type);

        /**
         * 从数据库加载更多新闻
         *
         * @param type
         * @param offset
         * @param limit
         */
        void loadMore(String type, int offset, int limit);
    }

    /**
     * ContentModel
     */
    public interface ContentModel {

    }

    /**
     * ContentView
     */
    public interface ContentView {

    }

    /**
     * ContentPresenter
     */
    public interface ContentPresenter {

    }

}
