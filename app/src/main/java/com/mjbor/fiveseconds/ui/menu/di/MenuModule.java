package com.mjbor.fiveseconds.ui.menu.di;

import com.mjbor.fiveseconds.application.ActivityScope;
import com.mjbor.fiveseconds.application.core.Interactor;
import com.mjbor.fiveseconds.realm.IRepository;
import com.mjbor.fiveseconds.ui.game.GameActivity;
import com.mjbor.fiveseconds.ui.menu.MenuActivity;
import com.mjbor.fiveseconds.ui.menu.MenuPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mjbor on 1/19/2018.
 */

@Module
public class MenuModule {

    private MenuActivity menuActivity;
    private GameActivity gameActivity;
    public MenuModule(MenuActivity menuActivity) {
        this.menuActivity = menuActivity;
    }

    @Provides
    @ActivityScope
    MenuActivity provideMenuActivity(){
        return menuActivity;
    }


    @Provides
    @ActivityScope
    MenuPresenter provideMenuPresenter(Interactor interactor, IRepository repository){
        return new MenuPresenter(menuActivity, interactor, repository);
    }


}
