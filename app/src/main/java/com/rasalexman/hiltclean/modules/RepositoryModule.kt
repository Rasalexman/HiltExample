package com.rasalexman.hiltclean.modules

import com.rasalexman.hiltclean.data.repository.ITranslateRepository
import com.rasalexman.hiltclean.data.repository.TranslateRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindTranslateRepository(translateRepository: TranslateRepository): ITranslateRepository
}