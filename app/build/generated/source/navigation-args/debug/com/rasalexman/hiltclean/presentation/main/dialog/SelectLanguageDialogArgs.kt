package com.rasalexman.hiltclean.presentation.main.dialog

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class SelectLanguageDialogArgs(
  val langType: String = ""
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("langType", this.langType)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): SelectLanguageDialogArgs {
      bundle.setClassLoader(SelectLanguageDialogArgs::class.java.classLoader)
      val __langType : String?
      if (bundle.containsKey("langType")) {
        __langType = bundle.getString("langType")
        if (__langType == null) {
          throw IllegalArgumentException("Argument \"langType\" is marked as non-null but was passed a null value.")
        }
      } else {
        __langType = ""
      }
      return SelectLanguageDialogArgs(__langType)
    }
  }
}
