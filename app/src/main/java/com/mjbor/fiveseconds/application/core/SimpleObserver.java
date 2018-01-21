package com.mjbor.fiveseconds.application.core;

import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by mjbor on 1/20/2018.
 */

public abstract class SimpleObserver<T> implements Observer<T> {

    @Override
    public void onSubscribe(Disposable d) {

        Log.e("SimpleObserver", "onSubscribe");
    }

    @Override
    public void onError(Throwable e) {
        Log.e("SimpleObserver", "onError");
    }


    @Override
    public void onComplete() {
        Log.e("SimpleObserver", "onComplete");
    }
}
