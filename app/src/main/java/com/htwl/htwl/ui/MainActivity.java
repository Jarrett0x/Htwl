package com.htwl.htwl.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioGroup;

import com.htwl.htwl.R;
import com.htwl.htwl.adapter.TabPageAdapter;
import com.htwl.htwl.base.BaseActivity;
import com.htwl.htwl.fragment.HomeFragment;
import com.htwl.htwl.fragment.MeFragment;
import com.htwl.htwl.fragment.PositionFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener, ViewPager.OnPageChangeListener {

    private List<Fragment> fragments = new ArrayList<Fragment>();
    private RadioGroup mRadioGroup;
    private ViewPager mViewPager;
    private final int[] ids = {R.id.main_btn_home, R.id.main_btn_position, R.id.main_btn_me};

    private int mCurrentTab;// 当前选中的Tab


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    @Override
    protected void init() {
        Fragment homeFragment = new HomeFragment();
        Fragment positionFragment = new PositionFragment();
        Fragment meFragment = new MeFragment();

        fragments.add(homeFragment);
        fragments.add(positionFragment);
        fragments.add(meFragment);
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initData() {
        mRadioGroup = (RadioGroup) findViewById(R.id.main_rg);
        mViewPager = (ViewPager) findViewById(R.id.main_vp);

        // 为RadioGroup设置监听事件
        mRadioGroup.setOnCheckedChangeListener(this);

        mViewPager.setAdapter(new TabPageAdapter(getSupportFragmentManager(), fragments));
        mViewPager.setOnPageChangeListener(this);

        // 设置默认值
        mCurrentTab = 0;
        mRadioGroup.check(ids[mCurrentTab]);
        mViewPager.setCurrentItem(mCurrentTab, false);
    }



    // -----RadioGroup需要重写的方法
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.main_btn_home:
                mCurrentTab = 0;
                break;

            case R.id.main_btn_position:
                mCurrentTab = 1;
                break;

            case R.id.main_btn_me:
                mCurrentTab = 2;
                break;
        }
        mViewPager.setCurrentItem(mCurrentTab);
    }

    // -----ViewPager需要重写的方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        selectPage(position);
        mRadioGroup.check(ids[position]);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     * 选择某页
     * @param position
     */
    private void selectPage(int position) {
        mViewPager.setCurrentItem(position, false);
    }
}
