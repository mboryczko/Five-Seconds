package com.mjbor.fiveseconds.realm;

import com.mjbor.fiveseconds.models.Question;
import com.mjbor.fiveseconds.models.Statistics;

import java.util.List;

import io.realm.Realm;

/**
 * Created by mjbor on 1/19/2018.
 */

public class RealmRepository implements IRepository{

    private Realm realm;

    public RealmRepository(Realm realm) {
        this.realm = realm;
    }

    @Override
    public void insertQuestion(Question question) {
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(question);
        realm.commitTransaction();
    }

    @Override
    public void insertQuestions(List<Question> questions) {
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(questions);
        realm.commitTransaction();
    }

    @Override
    public void updateDataBase(List<Question> questions) {
        insertQuestions(questions);
    }

    @Override
    public List<Question> getAllQuestions() {
        return realm.where(Question.class)
                .findAll();
    }

    @Override
    public void incrementAppLaunches() {

        realm.beginTransaction();
        Statistics statistics = realm.where(Statistics.class)
                .findFirst();



        if(statistics == null){
            statistics = new Statistics();
        }

        statistics.setAppLaunches(statistics.getAppLaunches()+1);
        realm.copyToRealmOrUpdate(statistics);
        realm.commitTransaction();
    }

    @Override
    public int getAppLaunches() {
        Statistics statistics = realm.where(Statistics.class)
                .findFirst();
        return statistics.getAppLaunches();
    }
}
