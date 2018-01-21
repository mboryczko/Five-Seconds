package com.mjbor.fiveseconds.ui.game;

import com.mjbor.fiveseconds.realm.IRepository;

/**
 * Created by mjbor on 1/20/2018.
 */

public class GamePresenter {

    private GameView view;
    private IRepository repository;

    public GamePresenter(GameView view, IRepository repository) {
        this.view = view;
        this.repository = repository;
    }


}
