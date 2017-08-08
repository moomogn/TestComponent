package com.arno.common;

import android.util.Log;

/**
 * Created by Arno on 2017/8/8.
 */

public class LogUtils {

    private static final String TAG = "[DEBUG]";

    public static void debug(String info){
        Log.d(TAG, "debug: "+info);
    }

}
