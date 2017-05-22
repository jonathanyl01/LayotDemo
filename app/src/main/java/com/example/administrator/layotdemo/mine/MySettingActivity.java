package com.example.administrator.layotdemo.mine;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;
import com.example.administrator.layotdemo.mine.acyivity.MessageRemindActivity;
import com.example.administrator.layotdemo.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.OnClick;

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
    private ActivityUtils activityUtils;

    @Override
    protected void initView() {

        initToolBar();

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

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



    @OnClick({R.id.re_changepassword, R.id.re_pravacy, R.id.re_attention, R.id.re_opinion, R.id.re_aboutlf, R.id.re_clean})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.re_changepassword:
                break;
            case R.id.re_pravacy:
                break;
            case R.id.re_attention:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(this, MessageRemindActivity.class);
                break;
            case R.id.re_opinion:
                break;
            case R.id.re_aboutlf:
                break;
            case R.id.re_clean:
                break;
        }
    }
}
