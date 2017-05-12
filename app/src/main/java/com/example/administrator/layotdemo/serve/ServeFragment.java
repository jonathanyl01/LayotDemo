package com.example.administrator.layotdemo.serve;

import android.support.v7.widget.Toolbar;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.base.BaseFragment;

import butterknife.BindView;
import butterknife.Unbinder;


public class ServeFragment extends BaseFragment {
    @BindView(R.id.server_toolbar)
    Toolbar serverToolbar;
    Unbinder unbinder;

    @Override
    protected int getContentViewLayout() {
        return R.layout.fragment_serve;
    }

    @Override
    protected void initView() {

        initToolBar();
    }

    private void initToolBar(){

    }


}
