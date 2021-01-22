package com.ts.getgithubusers.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ts.getgithubusers.data_source.contract.UserDataContract
import io.reactivex.disposables.CompositeDisposable

class UserViewModelFactory(private val repository: UserDataContract.Repository, private val compositeDisposable: CompositeDisposable) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return UserViewModel(
            repository,
            compositeDisposable
        ) as T
    }
}