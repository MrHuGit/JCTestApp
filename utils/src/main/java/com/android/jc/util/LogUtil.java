package com.android.jc.util;

import android.util.Log;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/1 10:01
 * @describe
 * @update
 */

public class LogUtil {
    private final static String TAG="hujiecai";
    private static boolean DEBUG=true;
    public static void i(String... value){
        if (DEBUG){
            Log.i(TAG,appendValue(value));
        }
    }
    private static String appendValue(String... value){
        StringBuilder stringBuilder=new StringBuilder();
        for (String s:value){
            stringBuilder.append(s).append(",");
        }
        return stringBuilder.toString();
    }
}
