package com.kaite.lianzhong.zhsq.mine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseFragment;
import com.kaite.lianzhong.zhsq.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


public class MineFragment extends BaseFragment {
    @BindView(R.id.myhousing)
    RelativeLayout myhousing;
    @BindView(R.id.re_collect)
    RelativeLayout reCollect;
    @BindView(R.id.re_shop)
    RelativeLayout reShop;
    @BindView(R.id.re_family)
    RelativeLayout reFamily;
    @BindView(R.id.re_setting)
    RelativeLayout reSetting;
    @BindView(R.id.mine_refresh)
    SwipeRefreshLayout mineRefresh;
    Unbinder unbinder;
    @BindView(R.id.ll_balance)
    LinearLayout llBalance;
    @BindView(R.id.ll_integral)
    LinearLayout llIntegral;
    @BindView(R.id.ll_ticket)
    LinearLayout llTicket;
    @BindView(R.id.re_usermessage)
    RelativeLayout reuserMessage;
    private Intent intent;
    private ActivityUtils activityUtils;

    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {

        activityUtils = new ActivityUtils();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.myhousing, R.id.re_collect, R.id.re_shop, R.id.re_family, R.id.re_setting, R.id.ll_balance, R.id.ll_integral, R.id.ll_ticket,R.id.re_usermessage})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.myhousing:
                activityUtils.openActivity(getContext(), MyHousingActivity.class);
                break;
            case R.id.re_collect:
                activityUtils.openActivity(getContext(), MycollectActivity.class);
                break;
            case R.id.re_shop:
                activityUtils.openActivity(getContext(), MyOrderActivity.class);
                break;
            case R.id.re_family:
                activityUtils.openActivity(getContext(), MyFamilyActivity.class);
                break;
            case R.id.re_setting:
                activityUtils.openActivity(getContext(), MySettingActivity.class);
                break;
            case R.id.ll_balance:
                activityUtils.openActivity(getContext(),PayActivity.class);
                break;
            case R.id.ll_integral:
                activityUtils.openActivity(getContext(),IntegralActivity.class);
                break;
            case R.id.ll_ticket:
                activityUtils.openActivity(getContext(),TicketActivity.class);
                break;
            case R.id.re_usermessage:
                activityUtils.openActivity(getContext(),UserInfoActivity.class);
                break;
        }
    }


}
