package com.rasalexman.hiltclean.presentation.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.rasalexman.hiltclean.common.consts.Consts
import com.rasalexman.hiltclean.common.extensions.asyncLiveData
import com.rasalexman.hiltclean.common.extensions.launchAsync
import com.rasalexman.hiltclean.data.Result
import com.rasalexman.hiltclean.domain.TranslateUseCase
import com.rasalexman.hiltclean.providers.preference.IUserPreference
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.filter
import java.util.*

class MainViewModel @ViewModelInject constructor(
    private val translateUseCase: TranslateUseCase,
    private val userPreference: IUserPreference
) : ViewModel() {

    val selectedLang = MutableLiveData(Locale.getDefault())
    val targetLang = MutableLiveData(Locale.ENGLISH)

    init {
        launchAsync {
            putLastLocaleTo(userPreference.selectedLang, selectedLang)
            putLastLocaleTo(userPreference.targetLang, targetLang)
        }
    }

    val errorResult = MutableLiveData<String>()
    val isLoading = MutableLiveData(false)

    val inputText = MutableLiveData<String>()
    val translatedText = inputText.asFlow()
        .filter { it != null }
        .debounce(DEBOUNCE_DELAY)
        .catch {
            println("Some critical issue $it")
        }
        .asLiveData()
        .distinctUntilChanged()
        .switchMap {
            asyncLiveData<String> {
                if(it.isNotEmpty()) {
                    isLoading.postValue(true)
                    val langPair = "${selectedLang.value?.language.orEmpty().toLowerCase()}|${targetLang.value?.language.orEmpty().toLowerCase()}"
                    when (val result = translateUseCase(it, langPair)) {
                        is Result.Success -> {
                            emit(result.data)
                        }
                        is Result.Error -> {
                            errorResult.postValue(result.exception.message.orEmpty())
                        }
                    }
                } else {
                    emit(it)
                }
                isLoading.postValue(false)
            }
        }

    fun switchLanguages() {
        val selectedLangValue = selectedLang.value ?: Locale.getDefault()
        val targetLangValue = targetLang.value ?: Locale.getDefault()
        selectedLang.value = targetLangValue
        targetLang.value = selectedLangValue

        val translatedTextValue = translatedText.value.orEmpty()
        inputText.value = translatedTextValue
    }

    fun updateLangByType(selectedLangIndex: Int, langType: String) {
        val chosenLang = Locale.getAvailableLocales()[selectedLangIndex]
        if(langType == Consts.SELECTED_LANG_TYPE) {
            userPreference.selectedLang = chosenLang.language
            selectedLang.value = chosenLang
        } else {
            userPreference.targetLang = chosenLang.language
            targetLang.value = chosenLang
        }
    }

    private fun putLastLocaleTo(lastLocale: String, liveData: MutableLiveData<Locale>) {
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