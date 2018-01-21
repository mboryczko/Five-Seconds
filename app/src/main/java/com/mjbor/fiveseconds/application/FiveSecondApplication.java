package com.mjbor.fiveseconds.application;

import android.app.Application;
import android.content.Context;

import com.mjbor.fiveseconds.application.components.AppComponent;
import com.mjbor.fiveseconds.application.components.DaggerAppComponent;
import com.mjbor.fiveseconds.application.modules.AppModule;
import com.mjbor.fiveseconds.application.modules.NetworkModule;
import com.mjbor.fiveseconds.application.modules.RealmModule;

/**
 * Created by mjbor on 1/19/2018.
 */

public class FiveSecondApplication extends Application{

    private AppComponent appComponent;
    private static FiveSecondApplication mInstance;

    public AppComponent getAppComponent(){
        return appComponent;
    }

    public static FiveSecondApplication get(Context context){
        return (FiveSecondApplication) context.getApplicationContext();
    }

    public static FiveSecondApplication getmInstance(){
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.mInstance = this;

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule()) //Can be removed because of no-arg constructor
                .realmModule(new RealmModule())
                .build();
    }
}
