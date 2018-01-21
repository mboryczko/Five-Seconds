package com.mjbor.fiveseconds.api;

/**
 * Created by mjbor on 1/19/2018.
 */


import com.mjbor.fiveseconds.models.Question;
import com.mjbor.fiveseconds.models.responses.QuestionResponse;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;



public interface WebService {

    @FormUrlEncoded
    @POST("getQuestions.php")
    Observable<QuestionResponse> getQuestions(@Field("topic") String topic);

    @FormUrlEncoded
    @POST("getQuestions.php")
    Call<QuestionResponse> getQuestionsCall(@Field("topic") String topic);

}
