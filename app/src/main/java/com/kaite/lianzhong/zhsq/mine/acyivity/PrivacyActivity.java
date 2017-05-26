package com.kaite.lianzhong.zhsq.mine.acyivity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;

import butterknife.BindView;

public class PrivacyActivity extends BaseActivity {


    @BindView(R.id.privacy_toolbar)
    Toolbar privacyToolbar;

    @Override
    protected void initView() {
        initToolBar();

    }

    private void initToolBar() {
        setSupportActionBar(privacyToolbar);
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
        return R.layout.activity_privacy;
    }


}
