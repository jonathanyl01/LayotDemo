package com.example.administrator.layotdemo.serve.activity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;

import butterknife.BindView;

public class SoliderActivity extends BaseActivity {


    @BindView(R.id.news_toolbar)
    Toolbar soliderToolbar;
    @BindView(R.id.tv_toolbar_title)
    TextView tvToolbarTitle;

    @Override
    protected void initView() {
        initToolbar();

    }

    private void initToolbar() {
       int a =  getIntent().getIntExtra("news",1000);
        if (a == 1000){
            setSupportActionBar(soliderToolbar);
            if (getSupportActionBar() != null){
                getSupportActionBar().setTitle("");
                tvToolbarTitle.setText("时政军事");
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        if (a == 2000){
            setSupportActionBar(soliderToolbar);
            if (getSupportActionBar() != null){
                getSupportActionBar().setTitle("");
                tvToolbarTitle.setText("经济动态");
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        if (a == 3000){
            setSupportActionBar(soliderToolbar);
            if (getSupportActionBar() != null){
                getSupportActionBar().setTitle("");
                tvToolbarTitle.setText("文化娱乐");
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        if (a == 4000){
            setSupportActionBar(soliderToolbar);
            if (getSupportActionBar() != null){
                getSupportActionBar().setTitle("");
                tvToolbarTitle.setText("体育动态");
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        if (a == 5000){
            setSupportActionBar(soliderToolbar);
            if (getSupportActionBar() != null){
                getSupportActionBar().setTitle("");
                tvToolbarTitle.setText("政府公告");
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }
        if (a == 6000){
            setSupportActionBar(soliderToolbar);
            if (getSupportActionBar() != null){
                getSupportActionBar().setTitle("");
                tvToolbarTitle.setText("政策宣传");
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }
        }

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {



    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_news;
    }


}
