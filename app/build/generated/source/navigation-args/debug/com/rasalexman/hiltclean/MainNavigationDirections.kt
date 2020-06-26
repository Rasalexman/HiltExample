package com.rasalexman.hiltclean

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class MainNavigationDirections private constructor() {
  companion object {
    fun showLoginFragment(): NavDirections = ActionOnlyNavDirections(R.id.showLoginFragment)

    fun showMainFragment(): NavDirections = ActionOnlyNavDirections(R.id.showMainFragment)
  }
}
