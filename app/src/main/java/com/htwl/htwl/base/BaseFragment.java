package com.htwl.htwl.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Jeck
 * @className com.htwl.htwl.base
 * @createdAt 2016/5/3 20:27
 * @desc Fragment的基类
 */
public abstract class BaseFragment extends Fragment {

    protected Context mContext;// 上下文，子类可以直接访问
    private View rootView;// 根View

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        if (rootView == null) {
            rootView = initView();
        }
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    protected void initData() {

    }

    protected abstract View initView();
}
