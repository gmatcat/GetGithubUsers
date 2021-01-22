package com.ts.getgithubusers.di

import com.ts.getgithubusers.MainActivity
import com.ts.getgithubusers.di.api.UserListApiModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class BindingModule {

    @ContributesAndroidInjector(
        modules = [UserListApiModule::class,
            UserListFragmentBuildersModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity

}
