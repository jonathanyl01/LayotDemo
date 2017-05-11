package com.example.administrator.layotdemo.mine;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseActivity;
import com.example.administrator.layotdemo.mine.adapter.MyOrderViewPagerAdapter;
import com.example.administrator.layotdemo.mine.fragment.FinishFragment;
import com.example.administrator.layotdemo.mine.fragment.WaitEvaluateFragment;
import com.example.administrator.layotdemo.mine.fragment.WaitPayFragment;
import com.example.administrator.layotdemo.mine.fragment.WaitRecieveFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MyOrderActivity extends BaseActivity {

    @BindView(R.id.order_toolbar)
    Toolbar orderToolbar;
    @BindView(R.id.order_tab)
    TabLayout orderTab;
    @BindView(R.id.order_viewpager)
    ViewPager orderViewpager;
    private List<String> listTitle;
    private List<Fragment> listFragment;
    private WaitPayFragment waitPayFragment;
    private WaitRecieveFragment waitRecieveFragment;
    private WaitEvaluateFragment waitEvaluateFragment;
    private FinishFragment finishFragment;


    @Override
    protected void initView() {

        initTab();
        initToolBar();
    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_my_order;
    }



    private void initTab() {

        listTitle = new ArrayList<>();
        listFragment = new ArrayList<>();

        waitPayFragment = new WaitPayFragment();
        waitRecieveFragment = new WaitRecieveFragment();
        waitEvaluateFragment = new WaitEvaluateFragment();
        finishFragment = new FinishFragment();
        listTitle.add("待付款");
        listTitle.add("待收货");
        listTitle.add("待评价");
        listTitle.add("已完成");

        orderTab.addTab(orderTab.newTab().setText(listTitle.get(0)));
        orderTab.addTab(orderTab.newTab().setText(listTitle.get(1)));
        orderTab.addTab(orderTab.newTab().setText(listTitle.get(2)));
        orderTab.addTab(orderTab.newTab().setText(listTitle.get(3)));

        listFragment.add(waitPayFragment);
        listFragment.add(waitRecieveFragment);
        listFragment.add(waitEvaluateFragment);
        listFragment.add(finishFragment);

        MyOrderViewPagerAdapter adapter = new MyOrderViewPagerAdapter(getSupportFragmentManager(),listTitle,listFragment);

        orderViewpager.setAdapter(adapter);
        orderTab.setupWithViewPager(orderViewpager);


    }

    private void initToolBar() {

        setSupportActionBar(orderToolbar);

        if (getSupportActionBar() != null){

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            getSupportActionBar().setTitle("");
        }



    }


}
