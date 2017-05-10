package com.example.administrator.layotdemo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2017/5/10.
 */

public class ActivityUtils {

    public void openActivity(Context context, Class <? extends Activity> targetActivity){

        Intent intent = new Intent(context,targetActivity);
        context.startActivity(intent);

    }

}
