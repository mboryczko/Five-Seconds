package com.mjbor.fiveseconds.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mjbor on 1/19/2018.
 */

public class Statistics extends RealmObject {
    @PrimaryKey
    private long id_statistics;
    private int questionsAnswered;
    private int appLaunches;


    public long getId_statistics() {
        return id_statistics;
    }

    public void setId_statistics(long id_statistics) {
        this.id_statistics = id_statistics;
    }

    public int getQuestionsAnswered() {
        return questionsAnswered;
    }

    public void setQuestionsAnswered(int questionsAnswered) {
        this.questionsAnswered = questionsAnswered;
    }

    public int getAppLaunches() {
        return appLaunches;
    }

    public void setAppLaunches(int appLaunches) {
        this.appLaunches = appLaunches;
    }
}
