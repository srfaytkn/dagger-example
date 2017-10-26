package com.srfaytkn.android.daggerexample.ui.detail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.srfaytkn.android.daggerexample.R;
import com.srfaytkn.android.daggerexample.base.BaseActivity;
import com.srfaytkn.android.daggerexample.ui.detail.first.FirstFragment;

/**
 * Created by srfaytkn on 10/26/17.
 */

public class DetailActivity extends BaseActivity {

    public static Intent newIntent(Activity callerActivity) {
        return new Intent(callerActivity, DetailActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        changeFragment(FirstFragment.newInstance());
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hideProgressDialog() {

    }
}
