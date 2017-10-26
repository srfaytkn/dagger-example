package com.srfaytkn.android.daggerexample.ui.main;

import com.srfaytkn.android.daggerexample.data.api.service.AuthService;
import com.srfaytkn.android.daggerexample.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by srfaytkn on 10/25/17.
 */

@Module
public class MainModule {

    @Provides
    @ActivityScope
    MainPresenter provideMainPresenter(AuthService authService) {
        return new MainPresenter(authService);
    }
}
