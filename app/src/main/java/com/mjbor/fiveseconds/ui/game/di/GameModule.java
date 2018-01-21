package com.mjbor.fiveseconds.ui.game.di;

import com.mjbor.fiveseconds.realm.IRepository;
import com.mjbor.fiveseconds.ui.game.GameActivity;
import com.mjbor.fiveseconds.ui.game.GamePresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mjbor on 1/20/2018.
 */

@Module
public class GameModule {

    private GameActivity gameActivity;

    public GameModule(GameActivity gameActivity) {
        this.gameActivity = gameActivity;
    }

    @Provides
    @Singleton
    GameActivity provideGameActivity(){
        return gameActivity;
    }

    @Provides
    @Singleton
    GamePresenter provideGamePresenter(IRepository repository){
        return new GamePresenter(gameActivity, repository);
    }
}
