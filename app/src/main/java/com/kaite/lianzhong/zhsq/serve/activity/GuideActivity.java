package com.kaite.lianzhong.zhsq.serve.activity;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;
import com.kaite.lianzhong.zhsq.serve.adapter.TitleListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class GuideActivity extends BaseActivity {


    @BindView(R.id.list_title)
    ListView listTitle;
    @BindView(R.id.guide_toolbar)
    Toolbar toolbar;
    private List<String> title;

    @Override
    protected void initView() {
        initTitleList();
        initToolbar();

    }

    private void initToolbar() {
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initTitleList() {
        title = new ArrayList<String>();
        title.add("房屋过户");
        title.add("小区");
        TitleListAdapter adapter = new TitleListAdapter(this,title);
        listTitle.setAdapter(adapter);
    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_guide;
    }


}
