package com.mjbor.fiveseconds.application.modules;

/**
 * Created by mjbor on 1/19/2018.
 */

import com.mjbor.fiveseconds.api.WebService;
import com.mjbor.fiveseconds.application.core.Interactor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    private static final String BASE_URL = "http://michalboryczko.pl/rxjava/";


    @Provides
    @Singleton
    Converter.Factory provideGsonConverter() {
        return GsonConverterFactory.create();
    }

    @Provides
    @Singleton
    RxJava2CallAdapterFactory provideRxJavaAdapterFactory() {
        return RxJava2CallAdapterFactory.create();
    }

    @Provides
    @Singleton
    HttpLoggingInterceptor provideInterceptor(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }


    @Provides
    @Singleton
    OkHttpClient provideDefaultOkHttpClient(HttpLoggingInterceptor interceptor) {
        return new OkHttpClient().newBuilder()
                .addInterceptor(interceptor)
                .build();
    }



    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient okHttpClient, Converter.Factory gsonConverterFactory, RxJava2CallAdapterFactory rxJava2CallAdapterFactory ) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(rxJava2CallAdapterFactory)
                .addConverterFactory(gsonConverterFactory)
                .build();
    }

    @Provides
    @Singleton
    WebService provideWebApi(Retrofit retrofit) {
        return retrofit.create(WebService.class);
    }

    @Provides
    @Singleton
    Interactor provideInteractor(WebService api){
        return new Interactor(api);
    }

}

