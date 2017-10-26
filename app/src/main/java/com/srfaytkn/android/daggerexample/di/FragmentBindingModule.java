package com.srfaytkn.android.daggerexample.di;

import com.srfaytkn.android.daggerexample.di.scope.FragmentScope;
import com.srfaytkn.android.daggerexample.ui.detail.first.FirstFragment;
import com.srfaytkn.android.daggerexample.ui.detail.first.FirstModule;
import com.srfaytkn.android.daggerexample.ui.detail.second.SecondFragment;
import com.srfaytkn.android.daggerexample.ui.detail.second.SecondModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by srfaytkn on 10/25/17.
 */

@Module
public abstract class FragmentBindingModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = FirstModule.class)
    public abstract FirstFragment bindFirstFragment();

    @FragmentScope
    @ContributesAndroidInjector(modules = SecondModule.class)
    public abstract SecondFragment bindSecondFragment();
}
