package com.srfaytkn.android.daggerexample.di;

import android.app.Application;

import com.srfaytkn.android.daggerexample.MainApp;
import com.srfaytkn.android.daggerexample.data.api.ApiServiceModule;
import com.srfaytkn.android.daggerexample.data.api.NetworkModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by srfaytkn on 10/25/17.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBindingModule.class,
        FragmentBindingModule.class,
        ApiServiceModule.class,
        NetworkModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();

    }

    void inject(MainApp app);
}