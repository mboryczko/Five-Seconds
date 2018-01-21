package com.mjbor.fiveseconds.ui.menu.di;

import com.mjbor.fiveseconds.application.ActivityScope;
import com.mjbor.fiveseconds.application.components.AppComponent;
import com.mjbor.fiveseconds.ui.menu.MenuActivity;
import com.mjbor.fiveseconds.ui.menu.MenuPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mjbor on 1/19/2018.
 */

@ActivityScope
@Component(
    modules = MenuModule.class,
        dependencies = AppComponent.class
)
public interface MenuComponent {
    MenuActivity inject(MenuActivity menuActivity);
    MenuPresenter presenter();
}
