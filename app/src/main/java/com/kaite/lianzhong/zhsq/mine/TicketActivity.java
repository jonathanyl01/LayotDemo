package com.kaite.lianzhong.zhsq.mine;

import android.content.Intent;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;

import butterknife.BindView;

public class TicketActivity extends BaseActivity {


    @BindView(R.id.ticket_toolbar)
    Toolbar ticketToolbar;

    @Override
    protected void initView() {

        initToolBar();

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }


    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_ticket;
    }
    private void initToolBar() {
        setSupportActionBar(ticketToolbar);
        if (getSupportActionBar() != null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }

    }

}
