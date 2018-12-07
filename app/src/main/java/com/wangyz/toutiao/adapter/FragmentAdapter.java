package com.wangyz.toutiao.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.view.ViewGroup;

import com.wangyz.toutiao.view.NewsFragment;

import java.lang.reflect.Method;
import java.util.List;

/**
 * @author wangyz
 * FragmentAdapter
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    private List<NewsFragment> mList;

    private FragmentManager mFragmentManager;

    private List<String> mTitles;

    public FragmentAdapter(FragmentManager fm, List<NewsFragment> list, List<String> titles) {
        super(fm);
        this.mList = list;
        this.mFragmentManager = fm;
        this.mTitles = titles;
    }

    @Override
    public Fragment getItem(int i) {
        return mList.get(i);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        removeFragment(container, position);
        return super.instantiateItem(container, position);
    }


    private void removeFragment(ViewGroup container, int index) {
        String tag = getFragmentTag(container.getId(), index);
        Fragment fragment = mFragmentManager.findFragmentByTag(tag);
        if (fragment == null) {
            return;
        }
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.remove(fragment);
        fragmentTransaction.commit();
        mFragmentManager.executePendingTransactions();
    }

    private String getFragmentTag(int viewId, int index) {
        String tag = "";
        try {
            Class<FragmentPagerAdapter> cls = FragmentPagerAdapter.class;
            Class<?>[] parameterTypes = {int.class, long.class};
            Method method = cls.getDeclaredMethod("makeFragmentName", parameterTypes);
            method.setAccessible(true);
            tag = (String) method.invoke(this, viewId, index);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tag;
    }
}
