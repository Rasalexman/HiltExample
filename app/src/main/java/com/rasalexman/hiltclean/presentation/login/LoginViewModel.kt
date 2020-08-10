package com.rasalexman.hiltclean.presentation.login

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rasalexman.hiltclean.R
import com.rasalexman.hiltclean.common.extensions.launchAsync
import com.rasalexman.hiltclean.common.extensions.launchUI
import com.rasalexman.hiltclean.data.Result
import com.rasalexman.hiltclean.domain.IValidateUserNameUseCase
import com.rasalexman.hiltclean.domain.LoginUseCase
import com.rasalexman.hiltclean.model.ui.LoginData

class LoginViewModel @ViewModelInject constructor(
    private val loginUseCase: LoginUseCase,
    private val validateUserNameUseCase: IValidateUserNameUseCase
) : ViewModel() {

    val userName = MutableLiveData<String>()
    val userPassword = MutableLiveData<String>()
    val isButtonEnabled = MutableLiveData<Boolean>(false)
    val userNameError = MutableLiveData<Int>()
    val userPasswordError = MutableLiveData<Int>()

    private val _loginResult = MutableLiveData<LoginResult>()
    val loginResult: LiveData<LoginResult> = _loginResult

    fun login() {
        val name = userName.value
        val password = userPassword.value

        if(name == null || password == null) return

        launchAsync {
            // can be launched in a separate asynchronous job
            val result = loginUseCase(LoginData(name, password))

            if (result is Result.Success) {
                _loginResult.postValue(
                    LoginResult(
                        success = LoggedInUserView(
                            displayName = result.data.displayName
                        )
                    )
                )
            } else {
                _loginResult.postValue(LoginResult(error = R.string.login_failed))
            }
        }
    }

    fun loginDataChanged(username: String, password: String) = launchUI {
        val resultValidateName = validateUserNameUseCase(username)

        if (!resultValidateName) {
            isButtonEnabled.value = false
            userNameError.value = R.string.invalid_username
        } else if (!isPasswordValid(password)) {
            isButtonEnabled.value = false
            userPasswordError.value = R.string.invalid_password
        } else {
            isButtonEnabled.value = true
        }
    }

    // A placeholder password validation check
    private fun isPasswordValid(password: String): Boolean {
        return password.length > MINIMUM_PASSWORD_LENGHT
    }

    companion object {
        private const val MINIMUM_PASSWORD_LENGHT = 5
    }
}