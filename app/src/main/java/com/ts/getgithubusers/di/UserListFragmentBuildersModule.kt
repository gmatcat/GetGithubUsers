package com.ts.getgithubusers.di

import com.ts.getgithubusers.ui.profile.ProfileView
import com.ts.getgithubusers.ui.user_list.main.UserListView
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class UserListFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeUserListFragment(): UserListView

    @ContributesAndroidInjector
    abstract fun contributeProfileFragment(): ProfileView


}