package com.rasalexman.hiltclean.presentation.base

import android.widget.EditText
import androidx.databinding.BindingAdapter


@BindingAdapter("app:error")
fun onError(editText: EditText, errorId: Int?) {
    errorId?.let {
        editText.error = editText.context.getString(it)
    }
}