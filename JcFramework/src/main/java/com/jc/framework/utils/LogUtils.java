package com.jc.framework.utils;

import android.util.Log;

import com.jc.framework.exception.StopInstantiatedException;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/9 16:05
 * @describe
 * @update
 */

public final class LogUtils {
    private LogUtils() {
        throw new StopInstantiatedException();
    }

    private static String TAG = "JcFramework";
    protected static boolean Show = false;

    public static void v(String... s) {
        if (s != null && Show) {
            Log.v(TAG, StringUtils.buildString(s));
        }
    }

    public static void d(String... s) {
        if (s != null && Show) {
            Log.d(TAG, StringUtils.buildString(s));
        }
    }

    public static void i(String... s) {
        if (s != null && Show) {
            Log.i(TAG, StringUtils.buildString(s));
        }
    }

    public static void w(String... s) {
        if (s != null && Show) {
            Log.w(TAG, StringUtils.buildString(s));
        }
    }

    public static void e(String... s) {
        if (s != null && Show) {
            Log.e(TAG, StringUtils.buildString(s));
        }
    }
}
