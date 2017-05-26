package com.kaite.lianzhong.zhsq.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kaite.lianzhong.zhsq.R;
import com.kaite.lianzhong.zhsq.base.BaseListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;

/**
 * Created by Administrator on 2017/4/27 0027.
 */

public class HomeListAdapter extends BaseListAdapter<Integer, HomeListAdapter.ViewHolder> {


    @Override
    protected int getItemViewLayout() {
        return R.layout.home_list_item;
    }

    @Override
    protected ViewHolder getItemViewHolder(View view) {
        return new ViewHolder(view);
    }

    class ViewHolder extends BaseListAdapter.ViewHolder {
        @BindView(R.id.title)
        TextView title;
        @BindViews({
                R.id.itemiv1,
                R.id.itemiv2,
                R.id.itemiv3})
        ImageView[] imageViews;
        List ivList = new ArrayList();


        public ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void bind(int position) {

            title.setText("社区服务");
            ivList.add(R.drawable.ic_welcome1);
            ivList.add(R.drawable.ic_welcome1);
            ivList.add(R.drawable.ic_welcome3);

           for (int i =0;i<3;i++){

               imageViews[i].setImageResource((Integer) ivList.get(i));

           }
        }
    }

}
