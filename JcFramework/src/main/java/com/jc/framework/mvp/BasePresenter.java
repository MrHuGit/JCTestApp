package com.jc.framework.mvp;

import android.support.annotation.NonNull;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * @author Mr.Hu(Jc)
 * @create 2018/3/23 14:11
 * @describe
 * @update
 */

public class BasePresenter<V extends IBaseView> implements IBasePresenter {
    @NonNull
    private CompositeDisposable mCompositeDisposable;
    public BasePresenter(@NonNull V view) {
        view.setPresenter(this);
        mCompositeDisposable=new CompositeDisposable();
    }

    /**
     * 添加任务
     * @param disposable
     */
    protected void addDisposable(Disposable disposable){
        mCompositeDisposable.add(disposable);
    }
    protected CompositeDisposable getCompositeDisposable(){
        return mCompositeDisposable;
    }
    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {
        mCompositeDisposable.clear();
    }
}
