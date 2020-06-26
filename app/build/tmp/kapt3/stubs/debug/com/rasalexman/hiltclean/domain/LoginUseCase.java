package com.rasalexman.hiltclean.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/rasalexman/hiltclean/domain/LoginUseCase;", "Lcom/rasalexman/hiltclean/domain/IUseCase$Single;", "Lcom/rasalexman/hiltclean/model/ui/LoginData;", "Lcom/rasalexman/hiltclean/model/local/LoggedInUser;", "loginRepository", "Lcom/rasalexman/hiltclean/data/repository/LoginRepository;", "userPreference", "Lcom/rasalexman/hiltclean/providers/preference/IUserPreference;", "(Lcom/rasalexman/hiltclean/data/repository/LoginRepository;Lcom/rasalexman/hiltclean/providers/preference/IUserPreference;)V", "invoke", "Lcom/rasalexman/hiltclean/data/Result;", "inputData", "(Lcom/rasalexman/hiltclean/model/ui/LoginData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginUseCase implements com.rasalexman.hiltclean.domain.IUseCase.Single<com.rasalexman.hiltclean.model.ui.LoginData, com.rasalexman.hiltclean.model.local.LoggedInUser> {
    private final com.rasalexman.hiltclean.data.repository.LoginRepository loginRepository = null;
    private final com.rasalexman.hiltclean.providers.preference.IUserPreference userPreference = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.model.ui.LoginData inputData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.rasalexman.hiltclean.data.Result<com.rasalexman.hiltclean.model.local.LoggedInUser>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoginUseCase(@org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.data.repository.LoginRepository loginRepository, @org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.providers.preference.IUserPreference userPreference) {
        super();
    }
}