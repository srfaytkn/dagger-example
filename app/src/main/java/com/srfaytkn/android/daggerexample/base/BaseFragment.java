package com.srfaytkn.android.daggerexample.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

/**
 * Created by srfaytkn on 10/26/17.
 */

public abstract class BaseFragment extends Fragment implements MvpView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        AndroidSupportInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
