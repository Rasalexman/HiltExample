package com.rasalexman.hiltclean.providers.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&\u00a8\u0006\t"}, d2 = {"Lcom/rasalexman/hiltclean/providers/preference/IBasePreference;", "", "clear", "", "toLiveData", "Landroidx/lifecycle/LiveData;", "K", "property", "Lkotlin/reflect/KProperty0;", "app_debug"})
public abstract interface IBasePreference {
    
    @org.jetbrains.annotations.NotNull()
    public abstract <K extends java.lang.Object>androidx.lifecycle.LiveData<K> toLiveData(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty0<? extends K> property);
    
    public abstract void clear();
}