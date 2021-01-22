package com.ts.getgithubusers.ui.user_list.main

import com.ts.getgithubusers.data_source.model.User

interface UserListCallback {
    fun onViewProfile(id: User, inverted: Boolean)
}
