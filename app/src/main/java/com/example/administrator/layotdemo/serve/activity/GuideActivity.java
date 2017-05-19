package com.example.administrator.layotdemo.serve.activity;

import android.content.Intent;
import android.widget.ListView;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;
import com.example.administrator.layotdemo.serve.adapter.TitleListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class GuideActivity extends BaseActivity {


    @BindView(R.id.list_title)
    ListView listTitle;
    private List<String> title;

    @Override
    protected void initView() {
        initTitleList();

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
