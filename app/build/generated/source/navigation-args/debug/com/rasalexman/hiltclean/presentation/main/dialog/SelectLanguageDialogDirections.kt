package com.rasalexman.hiltclean.presentation.main.dialog

import androidx.navigation.NavDirections
import com.rasalexman.hiltclean.MainNavigationDirections

class SelectLanguageDialogDirections private constructor() {
  companion object {
    fun showLoginFragment(): NavDirections = MainNavigationDirections.showLoginFragment()

    fun showMainFragment(): NavDirections = MainNavigationDirections.showMainFragment()
  }
}
