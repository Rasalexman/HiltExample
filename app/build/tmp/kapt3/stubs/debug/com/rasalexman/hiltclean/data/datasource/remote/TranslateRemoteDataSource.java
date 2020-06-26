package com.rasalexman.hiltclean.data.datasource.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/rasalexman/hiltclean/data/datasource/remote/TranslateRemoteDataSource;", "Lcom/rasalexman/hiltclean/data/datasource/remote/ITranslateRemoteDataSource;", "translateApi", "Lcom/rasalexman/hiltclean/providers/network/api/ITranslateApi;", "(Lcom/rasalexman/hiltclean/providers/network/api/ITranslateApi;)V", "translateByQuery", "Lcom/rasalexman/hiltclean/data/Result;", "Lcom/rasalexman/hiltclean/model/remote/TranslateResponse;", "query", "", "langPair", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TranslateRemoteDataSource implements com.rasalexman.hiltclean.data.datasource.remote.ITranslateRemoteDataSource {
    private final com.rasalexman.hiltclean.providers.network.api.ITranslateApi translateApi = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object translateByQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String langPair, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.rasalexman.hiltclean.data.Result<com.rasalexman.hiltclean.model.remote.TranslateResponse>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public TranslateRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.providers.network.api.ITranslateApi translateApi) {
        super();
    }
}