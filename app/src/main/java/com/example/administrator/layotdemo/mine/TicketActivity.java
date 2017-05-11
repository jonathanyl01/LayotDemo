package com.example.administrator.layotdemo.mine;

import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;

import butterknife.BindView;

public class TicketActivity extends BaseActivity {


    @BindView(R.id.ticket_toolbar)
    Toolbar ticketToolbar;

    @Override
    protected void initView() {

        initToolBar();

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
