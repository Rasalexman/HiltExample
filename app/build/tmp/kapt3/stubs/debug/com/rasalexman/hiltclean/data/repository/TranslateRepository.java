package com.rasalexman.hiltclean.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/rasalexman/hiltclean/data/repository/TranslateRepository;", "Lcom/rasalexman/hiltclean/data/repository/ITranslateRepository;", "remoteDataSource", "Lcom/rasalexman/hiltclean/data/datasource/remote/ITranslateRemoteDataSource;", "(Lcom/rasalexman/hiltclean/data/datasource/remote/ITranslateRemoteDataSource;)V", "translateByQuery", "Lcom/rasalexman/hiltclean/data/Result;", "", "query", "langPair", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TranslateRepository implements com.rasalexman.hiltclean.data.repository.ITranslateRepository {
    private final com.rasalexman.hiltclean.data.datasource.remote.ITranslateRemoteDataSource remoteDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object translateByQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String langPair, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.rasalexman.hiltclean.data.Result<java.lang.String>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public TranslateRepository(@org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.data.datasource.remote.ITranslateRemoteDataSource remoteDataSource) {
        super();
    }
}