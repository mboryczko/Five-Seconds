package com.mjbor.fiveseconds.realm;

import com.mjbor.fiveseconds.models.Question;
import com.mjbor.fiveseconds.models.Statistics;

import java.util.List;

/**
 * Created by mjbor on 1/19/2018.
 */

public interface IRepository {
    void insertQuestion(Question question);
    void insertQuestions(List<Question> questions);
    void updateDataBase(List<Question> questions);
    List<Question> getAllQuestions();



    void incrementAppLaunches();
    int getAppLaunches();



}
