package com.example.administrator.layotdemo.mine;

import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/5/11.
 */

public class PayActivity extends BaseActivity {
    @BindView(R.id.pay_toolbar)
    Toolbar payToolbar;

    @Override
    protected void initView() {

        initTollbar();

    }


    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_pay;
    }

    private void initTollbar() {

        setSupportActionBar(payToolbar);
        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }

    }


}
