package com.mjbor.fiveseconds.ui.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mjbor.fiveseconds.R;
import com.mjbor.fiveseconds.application.components.AppComponent;
import com.mjbor.fiveseconds.application.components.BaseActivity;
import com.mjbor.fiveseconds.ui.game.di.GameModule;
import com.mjbor.fiveseconds.ui.menu.di.DaggerMenuComponent;
import com.mjbor.fiveseconds.ui.menu.di.MenuModule;

import javax.inject.Inject;

public class GameActivity extends BaseActivity implements GameView{

    @Inject
    GamePresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }


    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerGameComponent.builder()
                .appComponent(appComponent)
                .gameModule(new GameModule(this))
                .build().inject(this);
    }


}
