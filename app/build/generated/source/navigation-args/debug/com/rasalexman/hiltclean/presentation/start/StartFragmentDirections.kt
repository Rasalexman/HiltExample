package com.rasalexman.hiltclean.presentation.start

import androidx.navigation.NavDirections
import com.rasalexman.hiltclean.MainNavigationDirections

class StartFragmentDirections private constructor() {
  companion object {
    fun showLoginFragment(): NavDirections = MainNavigationDirections.showLoginFragment()

    fun showMainFragment(): NavDirections = MainNavigationDirections.showMainFragment()
  }
}
