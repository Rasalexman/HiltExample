package com.rasalexman.hiltclean.modules;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/rasalexman/hiltclean/modules/RepositoryModule;", "", "()V", "bindTranslateRepository", "Lcom/rasalexman/hiltclean/data/repository/ITranslateRepository;", "translateRepository", "Lcom/rasalexman/hiltclean/data/repository/TranslateRepository;", "app_debug"})
@dagger.Module()
public abstract class RepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.rasalexman.hiltclean.data.repository.ITranslateRepository bindTranslateRepository(@org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.data.repository.TranslateRepository translateRepository);
    
    public RepositoryModule() {
        super();
    }
}