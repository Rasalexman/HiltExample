package com.rasalexman.hiltclean.common

sealed class AppExceptions(message: String = "") : Exception(message) {
    object NullResponseDataException : AppExceptions("There is no response data")
    object NullResultDataException : AppExceptions("There is no result data")
}