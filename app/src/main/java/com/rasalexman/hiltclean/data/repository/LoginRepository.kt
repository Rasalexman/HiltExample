package com.rasalexman.hiltclean.data.repository

import com.rasalexman.hiltclean.data.Result
import com.rasalexman.hiltclean.data.datasource.local.ILoginLocalDataSource
import com.rasalexman.hiltclean.model.local.LoggedInUser
import com.rasalexman.hiltclean.model.ui.user.UserName
import com.rasalexman.hiltclean.model.ui.user.UserPassword
import javax.inject.Inject

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */

class LoginRepository @Inject constructor(
    private val dataSource: ILoginLocalDataSource
) : ILoginRepository {

    // in-memory cache of the loggedInUser object
    var user: LoggedInUser? = null
        private set

    val isLoggedIn: Boolean
        get() = user != null

    init {
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
        user = null
    }

    fun logout() {
        user = null
        dataSource.logout()
    }

    override fun login(username: UserName, password: UserPassword): Result<LoggedInUser> {
        // handle login
        val result = dataSource.login(username, password)

        if (result is Result.Success) {
            setLoggedInUser(result.data)
        }

        return result
    }

    private fun setLoggedInUser(loggedInUser: LoggedInUser) {
        this.user = loggedInUser
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }
}

interface ILoginRepository {
    fun login(username: UserName, password: UserPassword): Result<LoggedInUser>
}