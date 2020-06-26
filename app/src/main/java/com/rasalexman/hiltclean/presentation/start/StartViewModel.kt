package com.rasalexman.hiltclean.presentation.start

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.rasalexman.hiltclean.R
import com.rasalexman.hiltclean.common.extensions.asyncLiveData
import com.rasalexman.hiltclean.providers.preference.IUserPreference

class StartViewModel @ViewModelInject constructor(
    private val userPreference: IUserPreference
) : ViewModel() {

    init {
        println("-----> userPreference userID ${userPreference.uuid}")
    }

    val resultLiveData = asyncLiveData<Int> {
        if(userPreference.uuid.isNotEmpty()) {
            emit(R.id.showMainFragment)
        } else {
            emit(R.id.showLoginFragment)
        }
    }
}