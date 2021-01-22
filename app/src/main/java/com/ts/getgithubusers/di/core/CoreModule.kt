package com.ts.getgithubusers.di.core

import com.ts.getgithubusers.base.AppScheduler
import com.ts.getgithubusers.base.Scheduler
import dagger.Module
import dagger.Provides

@Module
class CoreModule {

    @Provides
    fun scheduler(): Scheduler {
        return AppScheduler()
    }
}