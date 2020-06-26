package com.rasalexman.hiltclean.providers.preference

import android.content.Context

class UserPreference(context: Context) : BasePreference(context), IUserPreference {
    override var uuid: String by stringPref("")
    override var name: String by stringPref("")
    override var email: String by stringPref("")

    override var selectedLang: String by stringPref("")
    override var targetLang: String by stringPref("")
}