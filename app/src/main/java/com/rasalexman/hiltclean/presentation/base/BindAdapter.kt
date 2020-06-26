package com.rasalexman.hiltclean.presentation.base

import android.widget.EditText
import androidx.databinding.BindingAdapter


object BindAdapter {

    @BindingAdapter("app:error")
    @JvmStatic fun onError(editText: EditText, errorId: Int?) {
        errorId?.let {
            editText.error = editText.context.getString(it)
        } ?: let {
            editText.error = null
        }
    }
}