package com.example.administrator.layotdemo.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;

import butterknife.ButterKnife;
import butterknife.Unbinder;



// 通用的Activity的基类
public abstract class BaseActivity extends TransitionActivity{

    private Unbinder mUnbinder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewLayout());
        mUnbinder = ButterKnife.bind(this);

        initView();
    }

    protected abstract void initView();
    protected abstract void initResultData(int requestCode, int resultCode, Intent data);

    // 让子类来告诉我们布局
    @LayoutRes
    protected abstract int getContentViewLayout();


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
        mUnbinder = null;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        initResultData(requestCode, resultCode, data);
    }
}
