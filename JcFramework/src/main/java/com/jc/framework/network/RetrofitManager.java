package com.jc.framework.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 17:56
 * @describe
 * @update
 */

public class RetrofitManager {
    private Retrofit mRetrofit;
    private RetrofitManager(){
        mRetrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpManager.getInstance().getOkHttpClient() )
                .build();
    }
    public static RetrofitManager getInstance(){
        return Holder.sInstance;
    }



    public Retrofit getRetrofit(String url){
//        mRetrofit.create()
        return mRetrofit;
    }

    private static class Holder{
        private static RetrofitManager sInstance=new RetrofitManager();
    }
}
