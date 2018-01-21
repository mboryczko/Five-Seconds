package com.mjbor.fiveseconds.application.components;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mjbor.fiveseconds.application.FiveSecondApplication;

import butterknife.ButterKnife;

/**
 * Created by mjbor on 1/19/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupActivityComponent(FiveSecondApplication.get(this).getAppComponent());

    }

    protected abstract void setupActivityComponent(AppComponent appComponent);
}
