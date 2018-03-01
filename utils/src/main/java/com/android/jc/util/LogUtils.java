package com.android.jc.util;

import android.util.Log;

/**
 * 作    者：胡结才
 * 公    司：深圳市思迪信息技术股份有限公司
 * 创建日期：2017/9/19 11:18
 * 版    本：1.0.0
 * 说    明：
 * 修    改：
 */

public class LogUtils {
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
