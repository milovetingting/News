package com.wangyz.toutiao.view;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.blankj.utilcode.util.NetworkUtils;
import com.wangyz.toutiao.R;
import com.wangyz.toutiao.base.BaseActivity;
import com.wangyz.toutiao.contract.Contract;
import com.wangyz.toutiao.presenter.ContentPresenter;

import butterknife.BindView;

public class ContentActivity extends BaseActivity<Contract.ContentView, ContentPresenter> implements Contract.ContentView {

    @BindView(R.id.activity_content_webview)
    WebView mWebView;

    private String mUrl;

    @Override
    protected int getContentViewId() {
        return R.layout.activity_content;
    }

    @Override
    protected void initAllMemberViews(Bundle savedInstanceState) {
        mUrl = getIntent().getStringExtra("url");
        mWebView.requestFocus();
        mWebView.setHorizontalScrollBarEnabled(false);
        mWebView.setVerticalScrollBarEnabled(false);
        mWebView.getSettings().setJavaScriptEnabled(true);
        boolean connected = NetworkUtils.isConnected();
        //设置缓存模式
        if (connected) {
            mWebView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        } else {
            mWebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        }
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.getSettings().setAppCacheEnabled(true);
        mWebView.getSettings().setAppCachePath(getApplicationContext().getFilesDir().getAbsolutePath() + "/cache");
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                //在当前WebView中处理，不跳转到浏览器
                mWebView.loadUrl(mUrl);
                return true;
            }
        });
        mWebView.loadUrl(mUrl);
    }

    @Override
    protected ContentPresenter createPresenter() {
        return new ContentPresenter();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && mWebView.canGoBack()) {
            mWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mWebView != null) {
            mWebView.removeAllViews();
            mWebView.destroy();
        }
    }
}
