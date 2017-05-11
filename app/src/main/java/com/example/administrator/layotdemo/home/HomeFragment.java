package com.example.administrator.layotdemo.home;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseFragment;
import com.example.administrator.layotdemo.base.banner.BannerAdapter;
import com.example.administrator.layotdemo.base.banner.BannerLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.example.administrator.layotdemo.R.id.bannerlayout;
import static com.example.administrator.layotdemo.R.id.tv_weather;


/**
 * Created by Administrator on 2017/4/24 0024.
 */

public class HomeFragment extends BaseFragment implements HomeListView.OnScrollChangedListener {

    @BindView(R.id.list_home_goods)
    HomeListView listHomeGoods;
    @BindView(R.id.home_toolbar)
    Toolbar homeToolbar;
    private Unbinder unbinder;
    private List list;
    private BannerLayout bannerLayout;
    private HomeListAdapter adapter;
    private TextView tvWeather;
    private BannerAdapter mBannerAdapter;
    private View viewHeader;
    private BannerLayout banner;

    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initView() {

        viewHeader = LayoutInflater.from(getContext()).inflate(R.layout.list_header, listHomeGoods, false);
        banner = (BannerLayout) viewHeader.findViewById(R.id.bannerlayout);
        initList();
        initToolBar();


    }

    private void initToolBar() {

        homeToolbar.getBackground().setAlpha(0);
        homeToolbar.setTitle("");
        ((AppCompatActivity)getActivity()).setSupportActionBar(homeToolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WindowManager.LayoutParams layoutParams = getActivity().getWindow().getAttributes();
            layoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | layoutParams.flags);
        }

        listHomeGoods.setOnScrollChangedListener(this);

    }

    private void initList() {


        bannerLayout = ButterKnife.findById(viewHeader, bannerlayout);
        tvWeather = ButterKnife.findById(viewHeader, tv_weather);

        tvWeather.setText("1111111111111111111111162167521879198729581275786479452966574672958297529827958952979");
        tvWeather.setSelected(true);

        list = new ArrayList();
        View v1 = LayoutInflater.from(getContext()).inflate(R.layout.view1, null);
        View v2 = LayoutInflater.from(getContext()).inflate(R.layout.view2, null);
        View v3 = LayoutInflater.from(getContext()).inflate(R.layout.view3, null);
        list.add(v1);
        list.add(v2);
        list.add(v3);

        mBannerAdapter = new BannerAdapter(list);
        bannerLayout.setAdapter(list);

        List listData = new ArrayList();
        for (int i = 0; i < 3; i++) {
            listData.add(i + "  ");
        }
        adapter = new HomeListAdapter();
        listHomeGoods.addHeaderView(viewHeader);
        adapter.addAll(listData);
        listHomeGoods.setAdapter(adapter);
    }


    @Override
    public void onScrollChanged(ListView who, int l, int t, int oldl, int oldt) {
        float height = banner.getHeight();  //获取图片的高度
        if (oldt < height){
            int i = Float.valueOf(oldt/height * 255).intValue();    //i 有可能小于 0
            homeToolbar.getBackground().setAlpha(Math.max(i,0));   // 0~255 透明度
        }else {
            homeToolbar.getBackground().setAlpha(255);
        }
    }
}
