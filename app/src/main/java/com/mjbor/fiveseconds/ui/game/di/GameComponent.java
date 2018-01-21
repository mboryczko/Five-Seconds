package com.mjbor.fiveseconds.ui.game.di;

import com.mjbor.fiveseconds.application.ActivityScope;
import com.mjbor.fiveseconds.application.components.AppComponent;
import com.mjbor.fiveseconds.ui.game.GameActivity;
import com.mjbor.fiveseconds.ui.game.GamePresenter;

import dagger.Component;

/**
 * Created by mjbor on 1/20/2018.
 */

@ActivityScope
@Component(
        modules = GameModule.class,
        dependencies = AppComponent.class
)
public interface GameComponent {
    GameActivity inject(GameActivity gameActivity);
    GamePresenter presenter();
}
