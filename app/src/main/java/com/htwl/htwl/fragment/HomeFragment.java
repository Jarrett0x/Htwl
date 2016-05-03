package com.htwl.htwl.fragment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.htwl.htwl.R;
import com.htwl.htwl.base.BaseFragment;

/**
 * @author Jeck
 * @className com.htwl.htwl.fragment
 * @createdAt 2016/5/3 20:41
 * @desc TODO
 */
public class HomeFragment extends BaseFragment {

    private TextView textView;

    @Override
    public View initView() {
        Log.d("HOME", "初始化了");
        View view = View.inflate(mContext, R.layout.fragment_home, null);
        textView = (TextView) view.findViewById(R.id.fg_home_tv);
        textView.setText("这是主页");
        textView.setTextSize(25);
        return view;
    }
}
