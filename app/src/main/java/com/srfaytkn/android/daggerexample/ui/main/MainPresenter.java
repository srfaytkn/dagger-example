package com.srfaytkn.android.daggerexample.ui.main;

import com.srfaytkn.android.daggerexample.data.api.service.AuthService;

/**
 * Created by srfaytkn on 10/25/17.
 */

public class MainPresenter {

    private final AuthService authService;

    public MainPresenter(AuthService authService) {
        this.authService = authService;
    }
}
