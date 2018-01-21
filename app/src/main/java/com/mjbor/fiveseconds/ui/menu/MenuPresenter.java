package com.mjbor.fiveseconds.ui.menu;

import com.mjbor.fiveseconds.application.core.Interactor;
import com.mjbor.fiveseconds.application.core.SimpleObserver;
import com.mjbor.fiveseconds.models.Question;
import com.mjbor.fiveseconds.models.responses.QuestionResponse;
import com.mjbor.fiveseconds.realm.IRepository;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by mjbor on 1/19/2018.
 */

public class MenuPresenter {
    private MenuView view;
    private Interactor interactor;
    private IRepository repository;

    private int appLaunches;

    public MenuPresenter(MenuView view, Interactor interactor, IRepository repository) {
        this.view = view;
        this.interactor = interactor;
        this.repository = repository;

    }

    public void onCreate(){

        //if it is 1st launch -> get data from API
        appLaunches = repository.getAppLaunches();
        if(appLaunches == 0){
            Observable<QuestionResponse> questionResponseObservable = interactor.fetchQuestions();
            questionResponseObservable
                    .subscribe(new SimpleObserver<QuestionResponse>() {
                        @Override
                        public void onNext(QuestionResponse questionResponse) {
                            List<Question> questionList = questionResponse.getQuestions();
                            repository.insertQuestions(questionList);
                        }
                    });
        }

        incrementAppLaunches();
        setStatisticsInfo();
    }

    public void setStatisticsInfo(){
        view.setAppLaunches("App launches: " + appLaunches);
    }

    public void incrementAppLaunches(){
        repository.incrementAppLaunches();
    }
}
