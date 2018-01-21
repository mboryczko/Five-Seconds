package com.mjbor.fiveseconds.application.core;

import com.mjbor.fiveseconds.api.WebService;
import com.mjbor.fiveseconds.models.Question;
import com.mjbor.fiveseconds.models.responses.QuestionResponse;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mjbor on 1/19/2018.
 */

public class Interactor {

    private WebService api;

    public Interactor(WebService api) {
        this.api = api;
    }

    public Observable<QuestionResponse> fetchQuestions(){

        //TODO
        return api.getQuestions("all")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
