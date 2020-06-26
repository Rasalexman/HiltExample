package com.rasalexman.hiltclean.common.extensions

import com.rasalexman.hiltclean.common.AppExceptions
import com.rasalexman.hiltclean.data.datasource.remote.IBaseRemoteDataSource
import retrofit2.Response

suspend inline fun <reified T : Any> IBaseRemoteDataSource.fetchResult(noinline responseHandler: suspend () -> Response<T>): com.rasalexman.hiltclean.data.Result<T> {
    return try {
        responseHandler().body()?.run {
            com.rasalexman.hiltclean.data.Result.Success(this)
        } ?: com.rasalexman.hiltclean.data.Result.Error(AppExceptions.NullResponseDataException)
    } catch (e: Exception) {
        com.rasalexman.hiltclean.data.Result.Error(e)
    }
}