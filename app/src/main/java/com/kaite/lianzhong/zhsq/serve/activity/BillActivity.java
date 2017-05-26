package com.kaite.lianzhong.zhsq.serve.activity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;

import butterknife.BindView;

public class BillActivity extends BaseActivity {


    @BindView(R.id.bill_toolbar)
    Toolbar billToolbar;

    @Override
    protected void initView() {
        initToolbar();

    }

    private void initToolbar() {
        setSupportActionBar(billToolbar);
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
        return R.layout.activity_bill;
    }


}
