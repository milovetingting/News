package com.wangyz.toutiao.view;

import android.Manifest;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;

import com.wangyz.toutiao.R;
import com.wangyz.toutiao.adapter.FragmentAdapter;
import com.wangyz.toutiao.base.BaseActivity;
import com.wangyz.toutiao.contract.Contract;
import com.wangyz.toutiao.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.RuntimePermissions;

/**
 * @author wangyz
 * 主Activity
 */
@RuntimePermissions
public class MainActivity extends BaseActivity<Contract.MainView, MainPresenter> implements Contract.MainView {

    @BindView(R.id.activity_main_tab)
    TabLayout mTabLayout;

    @BindView(R.id.activity_main_viewpager)
    ViewPager mViewpager;

    private Context mContext;

    private FragmentManager mFragmentManager;

    private List<NewsFragment> mList = new ArrayList<>();

    private FragmentAdapter mAdapter;

    private List<String> mCategory = new ArrayList<>();

    private List<String> mCategoryEn = new ArrayList<>();

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initAllMemberViews(Bundle savedInstanceState) {
        mContext = getApplicationContext();

        MainActivityPermissionsDispatcher.requestPermissionWithPermissionCheck(this);

        mCategory = Arrays.asList(mContext.getResources().getStringArray(R.array.category));
        mCategoryEn = Arrays.asList(mContext.getResources().getStringArray(R.array.category_en));

        mFragmentManager = getSupportFragmentManager();

        for (String category : mCategoryEn) {
            NewsFragment fragment = new NewsFragment();
            fragment.setmType(category);
            mList.add(fragment);
        }

        mAdapter = new FragmentAdapter(mFragmentManager, mList, mCategory);
        mViewpager.setAdapter(mAdapter);

        mTabLayout.setupWithViewPager(mViewpager);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }


    @NeedsPermission({Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    void requestPermission() {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        MainActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    }
}
