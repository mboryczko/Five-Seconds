package com.mjbor.fiveseconds.application.modules;

/**
 * Created by mjbor on 1/19/2018.
 */

import android.app.Application;
import android.content.Context;

import com.mjbor.fiveseconds.realm.IRepository;
import com.mjbor.fiveseconds.realm.RealmRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;


@Module
public class RealmModule {

    @Provides
    @Singleton
    Realm provideRealmInstance(Application context){
        Realm.init(context);
        RealmConfiguration config = new RealmConfiguration
                .Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        return Realm.getInstance(config);
    }

    @Provides
    @Singleton
    IRepository provideRepository(Realm realm){
        return new RealmRepository(realm);
    }



}
