package com.kaite.lianzhong.zhsq.mine;

import android.content.Intent;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;

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
    protected void initResultData(int requestCode, int resultCode, Intent data) {

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
