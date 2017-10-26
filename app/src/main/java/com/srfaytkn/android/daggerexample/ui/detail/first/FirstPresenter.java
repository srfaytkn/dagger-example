package com.srfaytkn.android.daggerexample.ui.detail.first;

import com.srfaytkn.android.daggerexample.data.api.service.AuthService;

import javax.inject.Inject;

/**
 * Created by srfaytkn on 10/26/17.
 */

public class FirstPresenter {

    private final AuthService authService;

    @Inject
    public FirstPresenter(AuthService authService) {
        this.authService = authService;
    }
}
