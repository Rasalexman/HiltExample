package com.rasalexman.hiltclean.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/rasalexman/hiltclean/domain/IUseCase;", "", "Double", "Single", "SingleRaw", "app_debug"})
public abstract interface IUseCase {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0003J\u0019\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u00a6B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/rasalexman/hiltclean/domain/IUseCase$SingleRaw;", "In", "Out", "", "invoke", "inputData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface SingleRaw<In extends java.lang.Object, Out extends java.lang.Object> {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object invoke(In inputData, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super Out> p1);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0003J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u00a6B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/rasalexman/hiltclean/domain/IUseCase$Single;", "In", "Out", "", "invoke", "Lcom/rasalexman/hiltclean/data/Result;", "inputData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Single<In extends java.lang.Object, Out extends java.lang.Object> {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object invoke(In inputData, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.rasalexman.hiltclean.data.Result<? extends Out>> p1);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\b\b\u0002\u0010\u0003*\u00020\u00042\u00020\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u00a6B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/rasalexman/hiltclean/domain/IUseCase$Double;", "T1", "T2", "Out", "", "invoke", "Lcom/rasalexman/hiltclean/data/Result;", "param1", "param2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Double<T1 extends java.lang.Object, T2 extends java.lang.Object, Out extends java.lang.Object> {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object invoke(T1 param1, T2 param2, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.rasalexman.hiltclean.data.Result<? extends Out>> p2);
    }
}