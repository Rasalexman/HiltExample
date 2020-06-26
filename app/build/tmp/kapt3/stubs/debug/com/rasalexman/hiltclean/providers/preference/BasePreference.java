package com.rasalexman.hiltclean.providers.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/rasalexman/hiltclean/providers/preference/BasePreference;", "Lcom/chibatching/kotpref/KotprefModel;", "Lcom/rasalexman/hiltclean/providers/preference/IBasePreference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "toLiveData", "Landroidx/lifecycle/LiveData;", "K", "", "property", "Lkotlin/reflect/KProperty0;", "app_debug"})
public abstract class BasePreference extends com.chibatching.kotpref.KotprefModel implements com.rasalexman.hiltclean.providers.preference.IBasePreference {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <K extends java.lang.Object>androidx.lifecycle.LiveData<K> toLiveData(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty0<? extends K> property) {
        return null;
    }
    
    public BasePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null);
    }
}