package com.rasalexman.hiltclean.modules

import com.rasalexman.hiltclean.data.datasource.local.LoginLocalDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object LDSModule {

    @Provides
    @Singleton
    fun provideLoginDataSource() =
        LoginLocalDataSource()
}