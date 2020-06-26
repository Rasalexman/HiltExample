package com.rasalexman.hiltclean.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/rasalexman/hiltclean/data/repository/ITranslateRepository;", "", "translateByQuery", "Lcom/rasalexman/hiltclean/data/Result;", "", "query", "langPair", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ITranslateRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object translateByQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    java.lang.String langPair, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.rasalexman.hiltclean.data.Result<java.lang.String>> p2);
}