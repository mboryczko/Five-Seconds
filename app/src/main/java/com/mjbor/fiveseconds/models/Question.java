package com.mjbor.fiveseconds.models;

import com.mjbor.fiveseconds.application.core.BaseResponse;

import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

/**
 * Created by mjbor on 1/19/2018.
 */

public class Question extends RealmObject {

    @PrimaryKey
    private long id_question;
    private String question;

    private RealmList<String> answers;

    public long getId_question() {
        return id_question;
    }

    public void setId_question(long id_question) {
        this.id_question = id_question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public RealmList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(RealmList<String> answers) {
        this.answers = answers;
    }
}
