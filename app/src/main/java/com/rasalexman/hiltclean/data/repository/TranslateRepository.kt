package com.rasalexman.hiltclean.data.repository

import com.rasalexman.hiltclean.common.extensions.map
import com.rasalexman.hiltclean.data.Result
import com.rasalexman.hiltclean.data.datasource.remote.ITranslateRemoteDataSource
import javax.inject.Inject

class TranslateRepository @Inject constructor(
    private val remoteDataSource: ITranslateRemoteDataSource
) : ITranslateRepository {

    override suspend fun translateByQuery(query: String, langPair: String): Result<String> {
        return remoteDataSource.translateByQuery(query, langPair).map {
            val responseData = it.responseData
            responseData.matches?.firstOrNull()?.translation ?: responseData.translatedText
        }
    }
}

interface ITranslateRepository {
    suspend fun translateByQuery(query: String, langPair: String): Result<String>
}