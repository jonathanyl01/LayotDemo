package com.example.administrator.layotdemo.mine;

import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;

import butterknife.BindView;

public class MySettingActivity extends BaseActivity {

    @BindView(R.id.setting_toolbar)
    Toolbar settingToolbar;
    @BindView(R.id.re_changepassword)
    RelativeLayout reChangepassword;
    @BindView(R.id.re_pravacy)
    RelativeLayout rePravacy;
    @BindView(R.id.re_attention)
    RelativeLayout reAttention;
    @BindView(R.id.re_opinion)
    RelativeLayout reOpinion;
    @BindView(R.id.re_aboutlf)
    RelativeLayout reAboutlf;
    @BindView(R.id.re_clean)
    RelativeLayout reClean;
    @Override
    protected void initView() {

        initToolBar();

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_my_setting;
    }


    private void initToolBar() {

        setSupportActionBar(settingToolbar);

        if (getSupportActionBar() != null) {

            getSupportActionBar().setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


    }


}
