package com.rasalexman.hiltclean.modules;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/rasalexman/hiltclean/modules/ProvidersModule;", "", "()V", "provideOkHttp", "Lokhttp3/OkHttpClient;", "provideTranslateApi", "Lcom/rasalexman/hiltclean/providers/network/api/ITranslateApi;", "okHttpClient", "provideUserPreference", "Lcom/rasalexman/hiltclean/providers/preference/IUserPreference;", "application", "Landroid/app/Application;", "app_debug"})
@dagger.Module()
public final class ProvidersModule {
    public static final com.rasalexman.hiltclean.modules.ProvidersModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rasalexman.hiltclean.providers.preference.IUserPreference provideUserPreference(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rasalexman.hiltclean.providers.network.api.ITranslateApi provideTranslateApi(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    private ProvidersModule() {
        super();
    }
}