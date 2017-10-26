package com.srfaytkn.android.daggerexample.ui.main;

import android.os.Bundle;
import android.widget.Button;

import com.srfaytkn.android.daggerexample.R;
import com.srfaytkn.android.daggerexample.base.BaseActivity;
import com.srfaytkn.android.daggerexample.ui.detail.DetailActivity;

import javax.inject.Inject;

/**
 * Created by srfaytkn on 10/25/17.
 */

public class MainActivity extends BaseActivity {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_change_activity);
        button.setOnClickListener(v -> startActivity(DetailActivity.newIntent(this)));
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hideProgressDialog() {

    }
}
