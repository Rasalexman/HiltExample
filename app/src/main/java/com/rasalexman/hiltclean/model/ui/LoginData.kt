package com.rasalexman.hiltclean.model.ui

import com.rasalexman.hiltclean.model.ui.user.UserName
import com.rasalexman.hiltclean.model.ui.user.UserPassword

data class LoginData(
    private val _userName: String,
    private val _userPassword: String
) {
    val userName: UserName = UserName(_userName)
    val userPassword: UserPassword = UserPassword(_userPassword)
}