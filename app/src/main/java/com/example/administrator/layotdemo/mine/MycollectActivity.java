package com.example.administrator.layotdemo.mine;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MycollectActivity extends AppCompatActivity {

    @BindView(R.id.tab_collect)
    TabLayout tabCollect;
    @BindView(R.id.collect_viewpager)
    ViewPager collectViewpager;
    @BindView(R.id.standard_toolbar)
    Toolbar standardToolbar;
    private List<String> title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycollect);
        ButterKnife.bind(this);

        initTab();
        initToolbar();


    }

    private void initToolbar() {

        setSupportActionBar(standardToolbar);

        if (getSupportActionBar() != null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            getSupportActionBar().setTitle("我的收藏");
        }

    }

    private void initTab() {

        title = new ArrayList<String>();
        title.add("商家信息");
        title.add("商品详情");
        title.add("房产信息");
        title.add("社区活动");
        title.add("跳蚤市场");

        tabCollect.addTab(tabCollect.newTab().setText(title.get(0)));
        tabCollect.addTab(tabCollect.newTab().setText(title.get(1)));
        tabCollect.addTab(tabCollect.newTab().setText(title.get(2)));
        tabCollect.addTab(tabCollect.newTab().setText(title.get(3)));
        tabCollect.addTab(tabCollect.newTab().setText(title.get(4)));

    }
}
