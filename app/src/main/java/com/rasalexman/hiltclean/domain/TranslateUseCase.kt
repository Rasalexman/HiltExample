package com.rasalexman.hiltclean.domain

import com.rasalexman.hiltclean.data.Result
import com.rasalexman.hiltclean.data.repository.ITranslateRepository
import javax.inject.Inject

class TranslateUseCase @Inject constructor(
    private val translateRepository: ITranslateRepository
) : IUseCase.Double<String, String, String> {
    override suspend fun invoke(query: String, langPair: String): Result<String> {
        return translateRepository.translateByQuery(query, langPair)
    }
}