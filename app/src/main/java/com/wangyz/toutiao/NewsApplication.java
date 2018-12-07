package com.wangyz.toutiao;

import android.app.Application;

import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;

import org.litepal.LitePal;

/**
 * @author wangyz
 * Application
 */
public class NewsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        Utils.init(this);
        LogUtils.getConfig().setLogHeadSwitch(false);
    }

}
