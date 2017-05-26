package com.kaite.lianzhong.zhsq.mine;

import android.content.Intent;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;

import butterknife.BindView;

public class AddressActivity extends BaseActivity {


    @BindView(R.id.userinfo_toolbar)
    Toolbar userinfoToolbar;

    @Override
    protected void initView() {
        initToolBar();

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }


    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_address;
    }

    private void initToolBar() {
        setSupportActionBar(userinfoToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }
    }


}
