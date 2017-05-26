package com.kaite.lianzhong.zhsq.mine.acyivity;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;
import com.kaite.lianzhong.zhsq.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class IntegralMarketActivity extends BaseActivity {


    @BindView(R.id.integral_order)
    TextView integralOrder;
    @BindView(R.id.integral_market_toolbar)
    Toolbar integralMarketToolbar;
    @BindView(R.id.integral_market_list)
    RecyclerView integralMarketList;

    @Override
    protected void initView() {
        initToolBar();

    }

    private void initToolBar() {
        setSupportActionBar(integralMarketToolbar);
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
        return R.layout.activity_integral_market;
    }

    @OnClick(R.id.integral_order)
    public void onViewClicked() {
        ActivityUtils activityUtils = new ActivityUtils();
        activityUtils.openActivity(this,IntegralOrderActivity.class);
    }
}
