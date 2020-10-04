package com.rasalexman.hiltclean.modules

import com.rasalexman.hiltclean.data.datasource.local.ILoginLocalDataSource
import com.rasalexman.hiltclean.data.datasource.local.LoginLocalDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class LDSModule {

    @Binds
    @Singleton
    abstract fun provideLoginDataSource(loginLDS: LoginLocalDataSource): ILoginLocalDataSource
}