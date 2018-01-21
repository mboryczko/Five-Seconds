package com.mjbor.fiveseconds.ui.menu;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mjbor.fiveseconds.R;
import com.mjbor.fiveseconds.application.components.AppComponent;
import com.mjbor.fiveseconds.application.components.BaseActivity;
import com.mjbor.fiveseconds.ui.menu.di.DaggerMenuComponent;
import com.mjbor.fiveseconds.ui.menu.di.MenuModule;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MenuActivity extends BaseActivity implements MenuView {

    @Inject
    MenuPresenter presenter;

    @BindView(R.id.appLaunchesTextView)
        TextView appLaunchesTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);

        presenter.onCreate();
    }

    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        DaggerMenuComponent.builder()
                .appComponent(appComponent)
                .menuModule(new MenuModule(this))
                .build().inject(this);
        //appComponent.inject(this);
    }


    public void playGameClicked(View v){

    }

    @Override
    public void setAppLaunches(String appLaunches) {
        appLaunchesTextView.setText(appLaunches);
    }


}
