package com.example.administrator.layotdemo.home;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Administrator on 2017/5/11.
 */

public class HomeListView extends ListView {
    private OnScrollChangedListener onScrollChangedListener;
    public HomeListView(Context context) {
        super(context);
    }

    public HomeListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HomeListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (onScrollChangedListener != null){

            onScrollChangedListener.onScrollChanged(this,l,t,oldl,oldt);
        }
    }
    public void setOnScrollChangedListener(OnScrollChangedListener listener) {
        onScrollChangedListener = listener;
    }
    public interface OnScrollChangedListener {
        void onScrollChanged(ListView who, int l, int t, int oldl, int oldt);
    }
}
