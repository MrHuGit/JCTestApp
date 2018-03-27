package com.android.jc.network;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/26 17:44
 * @describe
 * @update
 */

public interface InfoService {
    @GET("/servlet/json")
    Flowable<InfoBean> requestInfolist(@Query("curpage")String curpage,
                                       @Query("catalogid")String catalogid,
                                       @Query("rowofpage")String rowofpage,
                                       @Query("funcNo")String funcNo);


}
