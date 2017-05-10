package com.example.administrator.layotdemo.mine;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.mine.adapter.MyOrderViewPagerAdapter;
import com.example.administrator.layotdemo.mine.fragment.FinishFragment;
import com.example.administrator.layotdemo.mine.fragment.WaitEvaluateFragment;
import com.example.administrator.layotdemo.mine.fragment.WaitPayFragment;
import com.example.administrator.layotdemo.mine.fragment.WaitRecieveFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyOrderActivity extends AppCompatActivity {

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


    public void openActivity(Context context){
        Intent intent = new Intent(context,MyOrderActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        ButterKnife.bind(this);


        initToolBar();
        initTab();

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

        orderToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
