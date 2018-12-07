package com.wangyz.toutiao.bean.db;

import org.litepal.crud.LitePalSupport;

/**
 * @author wangyz
 * News
 */
public class News extends LitePalSupport {

    public String author_name;

    public String category;

    public String date;

    public String thumbnail_pic_s;

    public String thumbnail_pic_s02;

    public String thumbnail_pic_s03;

    public String title;

    public String uniquekey;

    public String url;

    @Override
    public String toString() {
        return "News{" +
                "author_name='" + author_name + '\'' +
                ", category='" + category + '\'' +
                ", date='" + date + '\'' +
                ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                ", title='" + title + '\'' +
                ", uniquekey='" + uniquekey + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
