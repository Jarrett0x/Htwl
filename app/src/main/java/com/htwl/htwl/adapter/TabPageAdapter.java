package com.htwl.htwl.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.List;

/**
 * @author Jeck
 * @className com.htwl.htwl.adapter
 * @createdAt 2016/5/3 21:11
 * @desc TODO
 */
public class TabPageAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public TabPageAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    // 返回选中的条目
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    // 重写父类的方法不让Fragment销毁
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }
}
