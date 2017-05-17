package com.example.administrator.layotdemo.mine;

import android.content.Intent;
import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;

import butterknife.BindView;

public class MyHousingActivity extends BaseActivity {


    @BindView(R.id.housing_toolbar)
    Toolbar housingToolbar;

    @Override
    protected void initView() {

        initToolBar();

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_my_housing;
    }

    private void initToolBar() {

        setSupportActionBar(housingToolbar);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }


    }


}
