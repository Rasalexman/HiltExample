package com.rasalexman.hiltclean.modules

import android.app.Application
import com.rasalexman.hiltclean.domain.IValidateUserNameUseCase
import com.rasalexman.hiltclean.domain.ValidateUserNameUseCase
import com.rasalexman.hiltclean.providers.network.api.ITranslateApi
import com.rasalexman.hiltclean.providers.network.createOkHttpClient
import com.rasalexman.hiltclean.providers.network.createWebServiceApi
import com.rasalexman.hiltclean.providers.preference.IUserPreference
import com.rasalexman.hiltclean.providers.preference.UserPreference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object ProvidersModule {

    @Provides
    @Singleton
    fun provideUserPreference(application: Application): IUserPreference {
        return UserPreference(application.applicationContext)
    }

    @Provides
    @Singleton
    fun provideOkHttp(): OkHttpClient {
        return createOkHttpClient()
    }

    @Provides
    @Singleton
    fun provideTranslateApi(okHttpClient: OkHttpClient): ITranslateApi {
        return createWebServiceApi(okHttpClient = okHttpClient)
    }

    @Provides
    @Singleton
    fun provideValidateNameUseCase(): IValidateUserNameUseCase {
        return ValidateUserNameUseCase()
    }

}