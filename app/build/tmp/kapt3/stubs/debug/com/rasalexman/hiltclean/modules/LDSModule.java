package com.rasalexman.hiltclean.modules;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/rasalexman/hiltclean/modules/LDSModule;", "", "()V", "provideLoginDataSource", "Lcom/rasalexman/hiltclean/data/datasource/local/LoginLocalDataSource;", "app_debug"})
@dagger.Module()
public final class LDSModule {
    public static final com.rasalexman.hiltclean.modules.LDSModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rasalexman.hiltclean.data.datasource.local.LoginLocalDataSource provideLoginDataSource() {
        return null;
    }
    
    private LDSModule() {
        super();
    }
}