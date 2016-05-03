package com.htwl.htwl.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * @author Jack
 * @className com.htwl.htwl.base
 * @createdAt 2016/5/3 20:12
 * @desc 所有Activity的基类
 */
public abstract class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        initView();
        initData();
    }

    /**
     * 初始化
     */
    protected abstract void init();

    /**
     * 初始化视图
     */
    protected void initView(){

    }

    /**
     * 初始化数据
     */
    protected void initData(){

    }
}
