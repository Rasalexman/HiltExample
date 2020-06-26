package com.rasalexman.hiltclean.presentation.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.rasalexman.hiltclean.common.consts.Consts
import com.rasalexman.hiltclean.common.extensions.asyncLiveData
import com.rasalexman.hiltclean.common.extensions.launchAsync
import com.rasalexman.hiltclean.data.Result
import com.rasalexman.hiltclean.domain.TranslateUseCase
import com.rasalexman.hiltclean.providers.preference.IUserPreference
import kotlinx.coroutines.flow.debounce
import java.util.*

class MainViewModel @ViewModelInject constructor(
    private val translateUseCase: TranslateUseCase,
    private val userPreference: IUserPreference
) : ViewModel() {

    val selectedLang = MutableLiveData<Locale>(Locale.getDefault())
    val targetLang = MutableLiveData<Locale>(Locale.ENGLISH)

    init {
        launchAsync {
            putLastLocaleTo(userPreference.selectedLang, selectedLang)
            putLastLocaleTo(userPreference.targetLang, targetLang)
        }
    }

    val errorResult = MutableLiveData<String>()
    val isLoading = MutableLiveData<Boolean>(false)

    val inputText = MutableLiveData<String>()
    val translatedText = inputText.asFlow()
        .debounce(DEBOUNCE_DELAY)
        .asLiveData()
        .distinctUntilChanged()
        .switchMap {
            asyncLiveData<String> {
                isLoading.postValue(true)
                val langPair =
                    "${selectedLang.value!!.language.toLowerCase()}|${targetLang.value!!.language.toLowerCase()}"
                when (val result = translateUseCase(it, langPair)) {
                    is Result.Success -> {
                        emit(result.data)
                    }
                    is Result.Error -> {
                        errorResult.postValue(result.exception.message.orEmpty())
                    }
                }
                isLoading.postValue(false)
            }
        }

    fun switchLanguages() {
        val selectedLangValue = selectedLang.value
        val targetLangValue = targetLang.value
        selectedLang.value = targetLangValue
        targetLang.value = selectedLangValue

        val translatedTextValue = translatedText.value
        inputText.value = translatedTextValue
    }

    fun updateLangByType(selectedLangIndex: Int, langType: String) {
        val choosenLang = Locale.getAvailableLocales()[selectedLangIndex]
        if(langType == Consts.SELECTED_LANG_TYPE) {
            userPreference.selectedLang = choosenLang.language
            selectedLang.value = choosenLang
        } else {
            userPreference.targetLang = choosenLang.language
            targetLang.value = choosenLang
        }
    }

    private suspend fun putLastLocaleTo(lastLocale: String, liveData: MutableLiveData<Locale>) {
        val availableLocales = Locale.getAvailableLocales()
        val lastSelectedLang = lastLocale
            .takeIf { it.isNotEmpty() }
            ?.run { availableLocales.find { it.language == this } }
            ?: Locale.getDefault()
        liveData.postValue(lastSelectedLang)
    }

    companion object {
        private const val DEBOUNCE_DELAY = 500L
    }
}