package com.rasalexman.hiltclean.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/rasalexman/hiltclean/domain/TranslateUseCase;", "Lcom/rasalexman/hiltclean/domain/IUseCase$Double;", "", "translateRepository", "Lcom/rasalexman/hiltclean/data/repository/ITranslateRepository;", "(Lcom/rasalexman/hiltclean/data/repository/ITranslateRepository;)V", "invoke", "Lcom/rasalexman/hiltclean/data/Result;", "query", "langPair", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TranslateUseCase implements com.rasalexman.hiltclean.domain.IUseCase.Double<java.lang.String, java.lang.String, java.lang.String> {
    private final com.rasalexman.hiltclean.data.repository.ITranslateRepository translateRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String langPair, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.rasalexman.hiltclean.data.Result<java.lang.String>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public TranslateUseCase(@org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.data.repository.ITranslateRepository translateRepository) {
        super();
    }
}