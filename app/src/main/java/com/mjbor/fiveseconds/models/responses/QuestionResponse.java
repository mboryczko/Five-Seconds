package com.mjbor.fiveseconds.models.responses;

import com.mjbor.fiveseconds.models.Question;

import java.util.List;

/**
 * Created by mjbor on 1/20/2018.
 */

public class QuestionResponse {
    private String message;

    private String error;

    private List<Question> questions;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
