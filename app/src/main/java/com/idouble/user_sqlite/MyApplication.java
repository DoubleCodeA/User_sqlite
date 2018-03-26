package com.idouble.user_sqlite;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import org.litepal.LitePalApplication;

/**
 * Created by Administrator on 2018/3/26.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate ();
        context = getApplicationContext ();
        LitePalApplication.initialize (context);
    }

    public static Context getContext(){
        return context;
    }
}
