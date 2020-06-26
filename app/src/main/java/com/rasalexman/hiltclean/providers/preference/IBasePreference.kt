package com.rasalexman.hiltclean.providers.preference

import androidx.lifecycle.LiveData
import kotlin.reflect.KProperty0

interface IBasePreference {
    fun <K : Any> toLiveData(property: KProperty0<K>): LiveData<K>
    fun clear()
}