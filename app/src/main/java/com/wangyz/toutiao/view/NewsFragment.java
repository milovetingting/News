package com.wangyz.toutiao.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.blankj.utilcode.util.LogUtils;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.wangyz.toutiao.R;
import com.wangyz.toutiao.adapter.NewsAdapter;
import com.wangyz.toutiao.base.BaseFragment;
import com.wangyz.toutiao.bean.db.News;
import com.wangyz.toutiao.contract.Contract;
import com.wangyz.toutiao.presenter.NewsPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author wangyz
 * NewsFragment
 */
public class NewsFragment extends BaseFragment<Contract.NewsView, NewsPresenter> implements Contract.NewsView {

    private static final String TAG = NewsFragment.class.getSimpleName();

    @BindView(R.id.fragment_news_refresh)
    SmartRefreshLayout mSmartRefreshLayout;

    @BindView(R.id.fragment_news_list)
    RecyclerView mRecyclerView;

    private Context mContext;

    private NewsAdapter mAdapter;

    private List<News> mList = new ArrayList<>();

    private String mType;

    public void setmType(String mType) {
        this.mType = mType;
    }

    @Override
    protected int getContentViewId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initAllMemberViews(Bundle savedInstanceState) {
        mContext = getContext().getApplicationContext();

        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(mContext, DividerItemDecoration.VERTICAL));
        mAdapter = new NewsAdapter(getActivity(), mList);
        mRecyclerView.setAdapter(mAdapter);

        mSmartRefreshLayout.setOnRefreshListener(refreshLayout -> {
            mPresenter.loadNews(mType);
        });

        mSmartRefreshLayout.setOnLoadMoreListener(refreshLayout -> {
            mPresenter.loadMore(mType, mList.size(), 10);
        });

        mPresenter.initLoad(mType);

    }

    @Override
    protected NewsPresenter createPresenter() {
        return new NewsPresenter();
    }

    @Override
    public void onLoadFailed(Throwable e) {
        LogUtils.iTag(TAG, "onLoadFailed:" + e.getMessage());
        mSmartRefreshLayout.finishRefresh();
        mSmartRefreshLayout.finishLoadMore();
    }

    @Override
    public void onInitLoad(List<News> list) {
        LogUtils.iTag(TAG, "onInitLoad,list:" + list);
        if (list != null && list.size() > 0) {
            mList.addAll(0, list);
            mAdapter.setList(mList);
        }
    }

    @Override
    public void onLoadNews(List<News> list) {
        LogUtils.iTag(TAG, "onLoadNews,list:" + list);
        mSmartRefreshLayout.finishRefresh();
        if (list != null && list.size() > 0) {
            mList.addAll(0, list);
            mAdapter.setList(mList);
        }
    }

    @Override
    public void onLoadMore(List<News> list) {
        LogUtils.iTag(TAG, "onLoadMore,list:" + list);
        mSmartRefreshLayout.finishLoadMore();
        if (list != null && list.size() > 0) {
            mList.addAll(list);
            mAdapter.setList(mList);
        }
    }

}
