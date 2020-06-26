package com.rasalexman.hiltclean.presentation.login

import androidx.navigation.NavDirections
import com.rasalexman.hiltclean.MainNavigationDirections

class LoginFragmentDirections private constructor() {
  companion object {
    fun showLoginFragment(): NavDirections = MainNavigationDirections.showLoginFragment()

    fun showMainFragment(): NavDirections = MainNavigationDirections.showMainFragment()
  }
}
