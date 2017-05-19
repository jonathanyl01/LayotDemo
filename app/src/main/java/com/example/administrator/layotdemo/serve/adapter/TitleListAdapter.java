package com.example.administrator.layotdemo.serve.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.administrator.layotdemo.R;
import com.example.administrator.layotdemo.serve.activity.GuideActivity;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19.
 */

public class TitleListAdapter extends BaseAdapter {
    List<String> list ;
    Context context;
    public TitleListAdapter(GuideActivity guideActivity, List<String> title) {
        this.list = title;
        this.context = guideActivity;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.title_list_item,null);
            holder = new ViewHolder();
            holder.tvTitle = (TextView) view.findViewById(R.id.tv_title);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        holder.tvTitle.setText(list.get(i));
        return view;
    }
    class ViewHolder{
        TextView tvTitle;
    }
}
