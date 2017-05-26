package com.kaite.lianzhong.zhsq.mine;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseActivity;
import com.kaite.lianzhong.zhsq.mine.acyivity.IntegralGradeActivity;
import com.kaite.lianzhong.zhsq.mine.acyivity.IntegralMarketActivity;
import com.kaite.lianzhong.zhsq.mine.acyivity.IntegralRecordActivity;
import com.kaite.lianzhong.zhsq.mine.acyivity.IntegralRuleActivity;
import com.kaite.lianzhong.zhsq.mine.acyivity.PayRecordActivity;
import com.kaite.lianzhong.zhsq.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class IntegralActivity extends BaseActivity {


    @BindView(R.id.integral_toolbar)
    Toolbar integralToolbar;
    @BindView(R.id.re_onlinepay)
    RelativeLayout reOnlinepay;
    @BindView(R.id.re_payrecord)
    RelativeLayout rePayrecord;
    @BindView(R.id.re_integralmarket)
    RelativeLayout reIntegralmarket;
    @BindView(R.id.re_integralrecord)
    RelativeLayout reIntegralrecord;
    @BindView(R.id.re_integralrule)
    RelativeLayout reIntegralrule;
    @BindView(R.id.re_integralgrade)
    RelativeLayout reIntegralgrade;
    private ActivityUtils activityUtils;

    @Override
    protected void initView() {
        initToolBar();

    }

    @Override
    protected void initResultData(int requestCode, int resultCode, Intent data) {

    }


    @Override
    protected int getContentViewLayout() {
        return R.layout.activity_integral;
    }

    private void initToolBar() {
        setSupportActionBar(integralToolbar);
        if (getSupportActionBar() != null) {

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("");
        }
    }


    @OnClick({R.id.re_onlinepay, R.id.re_payrecord, R.id.re_integralmarket, R.id.re_integralrecord, R.id.re_integralrule, R.id.re_integralgrade})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.re_onlinepay:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(this,PayActivity.class);
                break;
            case R.id.re_payrecord:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(this, PayRecordActivity.class);
                break;
            case R.id.re_integralmarket:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(this, IntegralMarketActivity.class);
                break;
            case R.id.re_integralrecord:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(this, IntegralRecordActivity.class);
                break;
            case R.id.re_integralrule:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(this, IntegralRuleActivity.class);
                break;
            case R.id.re_integralgrade:
                if (activityUtils == null){
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(this, IntegralGradeActivity.class);
                break;
        }
    }
}
