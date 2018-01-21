package com.mjbor.fiveseconds.application.components;

import android.app.Application;

import com.mjbor.fiveseconds.ui.menu.MenuActivity;
import com.mjbor.fiveseconds.api.WebService;
import com.mjbor.fiveseconds.application.core.Interactor;
import com.mjbor.fiveseconds.application.modules.AppModule;
import com.mjbor.fiveseconds.application.modules.NetworkModule;
import com.mjbor.fiveseconds.application.modules.RealmModule;
import com.mjbor.fiveseconds.realm.IRepository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mjbor on 1/19/2018.
 */

@Singleton
@Component(
        modules = {AppModule.class, NetworkModule.class, RealmModule.class})
public interface AppComponent {

    Application getApplication();
    WebService getWebService();
    Interactor getinteractor();
    IRepository getRepository();
}
