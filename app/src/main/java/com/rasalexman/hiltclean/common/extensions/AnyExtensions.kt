package com.rasalexman.hiltclean.common.extensions

import com.rasalexman.hiltclean.data.Result
import java.lang.Exception

fun <T : Any> T.toSuccess(): Result.Success<T> {
    return Result.Success(this)
}

fun Exception.toError(): Result.Error {
    return Result.Error(this)
}