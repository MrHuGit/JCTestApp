package com.android.jc.util;

import android.util.Log;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/1 10:01
 * @describe
 * @update
 */

public class LogUtil {
    private final static String TAG="JC";
    private static boolean DEBUG=true;
    public static void i(String... value){
        if (DEBUG){
            Log.i(TAG,appendValue(value));
        }
    }
    private static String appendValue(String... value){
        StringBuilder stringBuilder=new StringBuilder();
        String result="";
        for (String s:value){
            stringBuilder.append(s).append(",");
        }
        if (stringBuilder.length()>0){
            result=stringBuilder.substring(0,stringBuilder.length()-1);
        }
        return result;
    }
}
