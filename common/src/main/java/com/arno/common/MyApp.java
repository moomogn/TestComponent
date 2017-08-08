package com.arno.common;

import android.app.Application;

/**
 * Created by Arno on 2017/8/8.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.debug("MyApp - onCreate");
    }
}
