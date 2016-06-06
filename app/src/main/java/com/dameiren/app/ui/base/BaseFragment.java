package com.dameiren.app.ui.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.shizhefei.fragment.LazyFragment;

/**
 * 作者:liujiacheng.
 * 日期: 2016/6/3 0003 09:56.
 * 描述：
 */
public abstract class BaseFragment extends LazyFragment {

    protected FragmentActivity mActivity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (FragmentActivity) getActivity();
    }
    @Override
    protected void onCreateViewLazy(Bundle savedInstanceState) {
        super.onCreateViewLazy(savedInstanceState);

    }
    @Override
    protected void onDestroyViewLazy() {
        super.onDestroyViewLazy();
//        ButterKnife.(this);
    }
}
