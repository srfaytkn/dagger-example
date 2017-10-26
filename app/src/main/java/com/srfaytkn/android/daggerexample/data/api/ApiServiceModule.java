package com.srfaytkn.android.daggerexample.data.api;

import com.srfaytkn.android.daggerexample.data.api.service.AuthService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by srfaytkn on 10/25/17.
 */

@Module
public class ApiServiceModule {

    @Provides
    @Singleton
    AuthService providesAuthService(Retrofit retrofit) {
        return retrofit.create(AuthService.class);
    }

}
