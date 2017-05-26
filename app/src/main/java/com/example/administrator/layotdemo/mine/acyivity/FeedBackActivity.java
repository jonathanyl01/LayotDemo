package com.example.administrator.layotdemo.mine.acyivity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;
import com.example.administrator.layotdemo.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class FeedBackActivity extends BaseActivity {


    @BindView(R.id.feed_back_toolbar)
    Toolbar feedBackToolbar;
    @BindView(R.id.feed_back_list)
    TextView feedBackList;
    @BindView(R.id.et_content)
    EditText etContent;
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.send_btn)
    Button sendBtn;
    private ActivityUtils activityUtils;

    @Override
    protected void initView() {

        initToolBar();
    }

    private void initToolBar() {
        setSupportActionBar(feedBackToolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_feed_back;
    }


    @OnClick({R.id.feed_back_list, R.id.send_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.feed_back_list:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(this,FeedBackListActivity.class);
                break;
            case R.id.send_btn:
                break;
        }
    }
}
