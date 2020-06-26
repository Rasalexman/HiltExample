package com.rasalexman.hiltclean.common.extensions

import com.rasalexman.hiltclean.common.AppExceptions
import com.rasalexman.hiltclean.data.Result

inline fun<reified T : Any, reified R : Any> Result<T>.map(handler: (T) -> R): Result<R> {
    return try {
        when(this) {
            is Result.Success<T> -> {
                val value = this.data as? T
                value?.let(handler)?.let {
                    Result.Success(it)
                } ?: Result.Error(AppExceptions.NullResultDataException) as Result<R>
            }
            is Result.Error -> {
                this
            }
        }
    } catch (e: Exception) {
        Result.Error(e)
    }
}