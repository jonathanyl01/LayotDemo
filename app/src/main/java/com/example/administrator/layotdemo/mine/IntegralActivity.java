package com.example.administrator.layotdemo.mine;

import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;

import butterknife.BindView;

public class IntegralActivity extends BaseActivity {


    @BindView(R.id.integral_toolbar)
    Toolbar integralToolbar;

    @Override
    protected void initView() {
        initToolBar();

    }


    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_integral;
    }

    private void initToolBar() {
        setSupportActionBar(integralToolbar);
        if (getSupportActionBar() != null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }
    }

}
