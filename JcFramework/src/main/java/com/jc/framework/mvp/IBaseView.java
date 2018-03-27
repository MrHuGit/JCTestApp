package com.jc.framework.mvp;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/23 14:10
 * @describe
 * @update
 */

public interface IBaseView<P> {
    /**
     * 添加Presenter
     * @param presenter
     */
    void setPresenter(P presenter);
}
