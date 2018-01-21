package com.mjbor.fiveseconds.application.core;

import io.realm.RealmObject;

/**
 * Created by mjbor on 1/19/2018.
 */

public class BaseResponse {

    private String message;
    private boolean error;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
