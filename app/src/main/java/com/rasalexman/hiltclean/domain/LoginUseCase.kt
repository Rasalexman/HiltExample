package com.rasalexman.hiltclean.domain

import com.rasalexman.hiltclean.data.repository.LoginRepository
import com.rasalexman.hiltclean.data.Result
import com.rasalexman.hiltclean.model.local.LoggedInUser
import com.rasalexman.hiltclean.model.ui.LoginData
import com.rasalexman.hiltclean.providers.preference.IUserPreference
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val loginRepository: LoginRepository,
    private val userPreference: IUserPreference
) : IUseCase.Single<LoginData, LoggedInUser> {
    override suspend fun invoke(inputData: LoginData): Result<LoggedInUser> {
        return loginRepository.login(inputData.userName, inputData.userPassword).also {
            if (it is Result.Success<LoggedInUser>) {
                userPreference.name = it.data.displayName
                userPreference.uuid = it.data.userId
                userPreference.email = inputData.userName.value
            }
        }
    }
}