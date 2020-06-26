package com.rasalexman.hiltclean.modules

import com.rasalexman.hiltclean.data.datasource.remote.ITranslateRemoteDataSource
import com.rasalexman.hiltclean.data.datasource.remote.TranslateRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class RDSModule {

    @Binds
    @Singleton
    abstract fun bindTranslateRemoteDataSource(realisation: TranslateRemoteDataSource): ITranslateRemoteDataSource
}