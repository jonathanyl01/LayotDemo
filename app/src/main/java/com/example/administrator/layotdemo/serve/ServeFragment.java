package com.example.administrator.layotdemo.serve;

import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseFragment;
import com.example.administrator.layotdemo.serve.activity.BillActivity;
import com.example.administrator.layotdemo.serve.activity.GuideActivity;
import com.example.administrator.layotdemo.serve.activity.InformActivity;
import com.example.administrator.layotdemo.serve.activity.SoliderActivity;
import com.example.administrator.layotdemo.utils.ActivityUtils;

import butterknife.BindView;
import butterknife.OnClick;


public class ServeFragment extends BaseFragment {
    @BindView(R.id.server_toolbar)
    Toolbar serverToolbar;
    @BindView(R.id.re_solider)
    RelativeLayout reSolider;
    @BindView(R.id.re_economy)
    RelativeLayout reEconomy;
    @BindView(R.id.re_culture)
    RelativeLayout reCulture;
    @BindView(R.id.re_sport)
    RelativeLayout reSport;
    @BindView(R.id.re_announcenment)
    RelativeLayout reAnnouncenment;
    @BindView(R.id.re_policy)
    RelativeLayout rePolicy;
    @BindView(R.id.re_guide)
    RelativeLayout reGuide;
    @BindView(R.id.re_inform)
    RelativeLayout reInform;
    @BindView(R.id.re_pay)
    RelativeLayout rePay;
    @BindView(R.id.re_server)
    RelativeLayout reServer;
    @BindView(R.id.re_house)
    RelativeLayout reHouse;
    @BindView(R.id.re_rent)
    RelativeLayout reRent;
    @BindView(R.id.re_opinion)
    RelativeLayout reOpinion;
    @BindView(R.id.re_phone)
    RelativeLayout rePhone;
    @BindView(R.id.re_lock)
    RelativeLayout reLock;
    private ActivityUtils activityUtils;
    private Intent intent;

    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_serve;
    }

    @Override
    protected void initView() {


    }


    @OnClick({R.id.re_solider, R.id.re_economy, R.id.re_culture, R.id.re_sport, R.id.re_announcenment, R.id.re_policy, R.id.re_guide, R.id.re_inform, R.id.re_pay, R.id.re_server, R.id.re_house, R.id.re_rent, R.id.re_opinion, R.id.re_phone, R.id.re_lock})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.re_solider:
                intent = new Intent(getContext(), SoliderActivity.class);
                intent.putExtra("news", 1000);
                startActivity(intent);
                break;
            case R.id.re_economy:
                intent = new Intent(getContext(), SoliderActivity.class);
                intent.putExtra("news", 2000);
                startActivity(intent);
                break;
            case R.id.re_culture:
                intent = new Intent(getContext(), SoliderActivity.class);
                intent.putExtra("news", 3000);
                startActivity(intent);
                break;
            case R.id.re_sport:
                intent = new Intent(getContext(), SoliderActivity.class);
                intent.putExtra("news", 4000);
                startActivity(intent);
                break;
            case R.id.re_announcenment:
                intent = new Intent(getContext(), SoliderActivity.class);
                intent.putExtra("news", 5000);
                startActivity(intent);
                break;
            case R.id.re_policy:
                intent = new Intent(getContext(), SoliderActivity.class);
                intent.putExtra("news", 6000);
                startActivity(intent);
                break;
            case R.id.re_guide:
                if (activityUtils == null) {
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(getContext(), GuideActivity.class);

                break;
            case R.id.re_inform:
                if (activityUtils == null) {
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(getContext(), InformActivity.class);
                break;
            case R.id.re_pay:
                if (activityUtils == null) {
                    activityUtils = new ActivityUtils();
                }
                activityUtils.openActivity(getContext(), BillActivity.class);
                break;
            case R.id.re_server:
                break;
            case R.id.re_house:
                break;
            case R.id.re_rent:
                break;
            case R.id.re_opinion:
                break;
            case R.id.re_phone:
                break;
            case R.id.re_lock:
                break;
        }
    }


}
