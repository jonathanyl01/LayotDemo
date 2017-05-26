package com.kaite.lianzhong.zhsq.home.adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.kaite.lianzhong.zhsq.R;

import java.util.List;

/**
 * Created by Administrator on 2017/5/24.
 */

public class MorePrtoductAdapter extends RecyclerView.Adapter<MorePrtoductAdapter.MyViewHolder> {
    LayoutInflater inflater;
    List<Integer> list;
    public MorePrtoductAdapter(Context context, List<Integer> list) {
        inflater = LayoutInflater.from(context);
        this.list = list;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.layout_more_item,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_product);
        }
    }
}
