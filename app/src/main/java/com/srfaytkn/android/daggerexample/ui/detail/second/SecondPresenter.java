package com.srfaytkn.android.daggerexample.ui.detail.second;

import com.srfaytkn.android.daggerexample.data.api.service.AuthService;

import javax.inject.Inject;

/**
 * Created by srfaytkn on 10/26/17.
 */

public class SecondPresenter {

    private final AuthService authService;

    @Inject
    public SecondPresenter(AuthService authService) {
        this.authService = authService;
    }
}
