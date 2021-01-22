package com.ts.getgithubusers.di.api

import com.ts.getgithubusers.data_source.remote.UserListApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class UserListApiModule {
    @Provides
    fun provideUserListApi(retrofit: Retrofit): UserListApi {
        return retrofit.create<UserListApi>(
            UserListApi::class.java)
    }
}
