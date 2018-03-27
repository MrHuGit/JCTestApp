package com.jc.framework.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 18:15
 * @describe
 * @update
 */

public class OkHttpManager {
    private OkHttpManager(){

    }
    public static OkHttpManager getInstance(){
        return Holder.sInstance;
    }


    public OkHttpClient getOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(3, TimeUnit.SECONDS)
                .writeTimeout(3, TimeUnit.SECONDS)
                .readTimeout(3, TimeUnit.SECONDS)
                .build();
    }

    private static class Holder{
        private static OkHttpManager sInstance=new OkHttpManager();
    }
}
