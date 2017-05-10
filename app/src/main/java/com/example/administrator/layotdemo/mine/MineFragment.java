package com.example.administrator.layotdemo.mine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.administrator.layotdemo.BaseFragment;
import com.example.administrator.layotdemo.R;

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
    private Intent intent;

    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {



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

    @OnClick({R.id.myhousing, R.id.re_collect, R.id.re_shop, R.id.re_family, R.id.re_setting})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.myhousing:
                intent = new Intent(getContext(),MyHousingActivity.class);
                startActivity(intent);
                break;
            case R.id.re_collect:
                intent = new Intent(getContext(),MycollectActivity.class);
                startActivity(intent);
                break;
            case R.id.re_shop:
                break;
            case R.id.re_family:
                break;
            case R.id.re_setting:
                break;
        }
    }
}
