package com.rasalexman.hiltclean.data.datasource.local

import com.rasalexman.hiltclean.data.Result
import com.rasalexman.hiltclean.model.local.LoggedInUser
import com.rasalexman.hiltclean.model.ui.user.UserName
import com.rasalexman.hiltclean.model.ui.user.UserPassword
import java.io.IOException
import java.util.*
import javax.inject.Inject

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginLocalDataSource @Inject constructor() : ILoginLocalDataSource {

    override fun login(username: UserName, password: UserPassword): Result<LoggedInUser> {
        return try {
            // TODO: handle loggedInUser authentication
            val fakeUser = LoggedInUser(
                UUID.randomUUID().toString(), "Jane Doe"
            )
            Result.Success(fakeUser)
        } catch (e: Throwable) {
            Result.Error(
                IOException(
                    "Error logging in",
                    e
                )
            )
        }
    }

    override fun logout() {
        // TODO: revoke authentication
    }
}

interface ILoginLocalDataSource {
    fun login(username: UserName, password: UserPassword): Result<LoggedInUser>
    fun logout()
}