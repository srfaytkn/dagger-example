package com.srfaytkn.android.daggerexample.di;

import com.srfaytkn.android.daggerexample.di.scope.ActivityScope;
import com.srfaytkn.android.daggerexample.ui.detail.DetailActivity;
import com.srfaytkn.android.daggerexample.ui.detail.DetailModule;
import com.srfaytkn.android.daggerexample.ui.main.MainActivity;
import com.srfaytkn.android.daggerexample.ui.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by srfaytkn on 10/25/17.
 */

@Module
public abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    public abstract MainActivity bindMainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = DetailModule.class)
    public abstract DetailActivity bindDetailActivity();
}
