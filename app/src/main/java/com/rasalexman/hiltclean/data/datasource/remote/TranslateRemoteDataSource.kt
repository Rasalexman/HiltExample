package com.rasalexman.hiltclean.data.datasource.remote

import com.rasalexman.hiltclean.common.extensions.fetchResult
import com.rasalexman.hiltclean.data.Result
import com.rasalexman.hiltclean.model.remote.TranslateResponse
import com.rasalexman.hiltclean.providers.network.api.ITranslateApi
import javax.inject.Inject

class TranslateRemoteDataSource @Inject constructor(
    private val translateApi: ITranslateApi
) : ITranslateRemoteDataSource {

    override suspend fun translateByQuery(query: String, langPair: String): Result<TranslateResponse> {
        return fetchResult {
            translateApi.getTranslate(query, langPair)
        }
    }
}

interface ITranslateRemoteDataSource : IBaseRemoteDataSource {
    suspend fun translateByQuery(query: String, langPair: String): Result<TranslateResponse>
}