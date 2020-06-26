package com.rasalexman.hiltclean.providers.preference

import android.content.Context
import androidx.lifecycle.LiveData
import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.livedata.asLiveData
import kotlin.reflect.KProperty0

abstract class BasePreference(context: Context) : KotprefModel(context), IBasePreference {

    override fun <K : Any> toLiveData(property: KProperty0<K>): LiveData<K> {
        return this.asLiveData(property)
    }
}