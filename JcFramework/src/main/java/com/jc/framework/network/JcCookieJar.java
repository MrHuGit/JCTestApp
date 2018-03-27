package com.jc.framework.network;

import okhttp3.CookieJar;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/11 22:10
 * @describe
 * @update
 */

public interface JcCookieJar extends CookieJar{

    /**
     * 清除
     */
    void clear();
}
