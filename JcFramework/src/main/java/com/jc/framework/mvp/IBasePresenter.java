package com.jc.framework.mvp;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/23 13:55
 * @describe
 * @update
 */

public interface IBasePresenter {


    /**
     * 订阅
     */
    void subscribe();

    /**
     * 取消订阅
     */
    void unSubscribe();
}
