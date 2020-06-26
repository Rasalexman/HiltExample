package com.rasalexman.hiltclean.providers.network.api

import com.rasalexman.hiltclean.model.remote.TranslateResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ITranslateApi {

    @GET("get")
    suspend fun getTranslate(
        @Query("q") query: String,
        @Query("langpair") langpair: String
    ): Response<TranslateResponse>
}