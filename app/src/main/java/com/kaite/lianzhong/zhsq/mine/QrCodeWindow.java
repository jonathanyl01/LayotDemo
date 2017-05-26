package com.kaite.lianzhong.zhsq.mine;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.kaite.lianzhong.zhsq.R;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/5/15.
 */

public class QrCodeWindow extends PopupWindow {

   Activity mActivity;



    // 调用父类的构造方法：通过参数实现视图填充
    public QrCodeWindow(Activity activity) {
        super(activity.getLayoutInflater().inflate(R.layout.layout_qrcode_show,null),
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        ButterKnife.bind(this,getContentView());

        mActivity = activity;

        setFocusable(true);// 获得焦点
        setBackgroundDrawable(new BitmapDrawable());// 设置背景
    }

    // 展示的方法
    public void show(){
        showAtLocation(mActivity.getWindow().getDecorView(), Gravity.CENTER,0,0);
    }
}
