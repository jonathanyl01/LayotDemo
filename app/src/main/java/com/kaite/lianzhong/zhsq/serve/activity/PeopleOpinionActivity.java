package com.kaite.lianzhong.zhsq.serve.activity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;

import butterknife.BindView;

public class PeopleOpinionActivity extends BaseActivity {


    @BindView(R.id.opinion_toolbar)
    Toolbar opinionToolbar;

    @Override
    protected void initView() {
        initToolBar();

    }

    private void initToolBar() {

        setSupportActionBar(opinionToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_people_opinion;
    }

}
