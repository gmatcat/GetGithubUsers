package com.ts.getgithubusers.di

import android.app.Application
import com.ts.getgithubusers.ApplicationClass
import com.ts.getgithubusers.di.api.UserListApiModule
import com.ts.getgithubusers.di.core.*
import com.ts.getgithubusers.di.core.ContextModule
import com.ts.getgithubusers.di.network.NetworkModule
import com.ts.getgithubusers.di.repo.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [AndroidInjectionModule::class,
        NetworkModule::class,
        ContextModule::class,
        RepositoryModule::class,
        BindingModule::class,
        UserListApiModule::class,
        CoreModule::class]
)
interface ApplicationComponent : AndroidInjector<ApplicationClass> {
    @Component.Builder
    interface Builder {


        @BindsInstance
        fun application(application: Application): ApplicationComponent.Builder

        fun build(): ApplicationComponent
    }
}