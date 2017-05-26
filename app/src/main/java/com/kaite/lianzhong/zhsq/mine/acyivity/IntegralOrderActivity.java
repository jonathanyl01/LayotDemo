package com.kaite.lianzhong.zhsq.mine.acyivity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class IntegralOrderActivity extends BaseActivity {


    @BindView(R.id.integral_order_toolbar)
    Toolbar integralOrderToolbar;
    @BindView(R.id.integral_order_tab)
    TabLayout integralOrderTab;

    @Override
    protected void initView() {
        initToolBar();
        initTab();

    }

    private void initTab() {
        List<String> listTitle = new ArrayList<>();
        listTitle.add("待收货");
        listTitle.add("待评价");
        listTitle.add("已完成");
        listTitle.add("已取消");

        integralOrderTab.addTab(integralOrderTab.newTab().setText(listTitle.get(0)));
        integralOrderTab.addTab(integralOrderTab.newTab().setText(listTitle.get(1)));
        integralOrderTab.addTab(integralOrderTab.newTab().setText(listTitle.get(2)));
        integralOrderTab.addTab(integralOrderTab.newTab().setText(listTitle.get(3)));
    }

    private void initToolBar() {
        setSupportActionBar(integralOrderToolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }

    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_integral_order;
    }

}
