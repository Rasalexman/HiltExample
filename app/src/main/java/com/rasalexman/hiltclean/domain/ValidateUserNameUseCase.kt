package com.rasalexman.hiltclean.domain

import android.util.Patterns

class ValidateUserNameUseCase : IValidateUserNameUseCase {
    @Suppress("PARAMETER_NAME_CHANGED_ON_OVERRIDE")
    override suspend fun invoke(username: String): Boolean {
        return if (username.contains("@")) {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else {
            username.isNotBlank()
        }
    }
}

interface IValidateUserNameUseCase : IUseCase.SingleRaw<String, Boolean>