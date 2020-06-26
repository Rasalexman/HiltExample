package com.rasalexman.hiltclean.presentation.main

import android.os.Bundle
import androidx.navigation.NavDirections
import com.rasalexman.hiltclean.MainNavigationDirections
import com.rasalexman.hiltclean.R
import kotlin.Int
import kotlin.String

class MainFragmentDirections private constructor() {
  private data class ShowSelectLanguageDialog(
    val langType: String = ""
  ) : NavDirections {
    override fun getActionId(): Int = R.id.showSelectLanguageDialog

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("langType", this.langType)
      return result
    }
  }

  companion object {
    fun showSelectLanguageDialog(langType: String = ""): NavDirections =
        ShowSelectLanguageDialog(langType)

    fun showLoginFragment(): NavDirections = MainNavigationDirections.showLoginFragment()

    fun showMainFragment(): NavDirections = MainNavigationDirections.showMainFragment()
  }
}
