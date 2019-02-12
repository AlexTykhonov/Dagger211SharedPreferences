package com.journaldev.dagger2.Module;

import com.journaldev.dagger2.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface MainActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity contributesMainActivity();

}
