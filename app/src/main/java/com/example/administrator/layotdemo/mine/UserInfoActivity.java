package com.example.administrator.layotdemo.mine;

import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;

import butterknife.BindView;

public class UserInfoActivity extends BaseActivity {


    @BindView(R.id.userinfo_toolbar)
    Toolbar userinfoToolbar;

    @Override
    protected void initView() {
        initToolBar();

    }



    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_user_info;
    }
    private void initToolBar() {
        setSupportActionBar(userinfoToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }

    }

}
