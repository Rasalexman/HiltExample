package com.rasalexman.hiltclean.providers.preference

interface IUserPreference : IBasePreference {
    var uuid: String
    var name: String
    var email: String

    var selectedLang: String
    var targetLang: String
}