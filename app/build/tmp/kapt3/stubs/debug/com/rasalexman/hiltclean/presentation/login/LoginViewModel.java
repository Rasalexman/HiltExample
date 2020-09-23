package com.rasalexman.hiltclean.presentation.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/rasalexman/hiltclean/presentation/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginUseCase", "Lcom/rasalexman/hiltclean/domain/LoginUseCase;", "validateUserNameUseCase", "Lcom/rasalexman/hiltclean/domain/IValidateUserNameUseCase;", "(Lcom/rasalexman/hiltclean/domain/LoginUseCase;Lcom/rasalexman/hiltclean/domain/IValidateUserNameUseCase;)V", "_loginResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/rasalexman/hiltclean/presentation/login/LoginResult;", "isButtonEnabled", "", "()Landroidx/lifecycle/MutableLiveData;", "loginResult", "Landroidx/lifecycle/LiveData;", "getLoginResult", "()Landroidx/lifecycle/LiveData;", "userName", "", "getUserName", "userNameError", "", "getUserNameError", "userPassword", "getUserPassword", "userPasswordError", "getUserPasswordError", "isPasswordValid", "password", "login", "", "loginDataChanged", "username", "Companion", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> userName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> userPassword = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isButtonEnabled = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> userNameError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> userPasswordError = null;
    private final androidx.lifecycle.MutableLiveData<com.rasalexman.hiltclean.presentation.login.LoginResult> _loginResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.rasalexman.hiltclean.presentation.login.LoginResult> loginResult = null;
    private final com.rasalexman.hiltclean.domain.LoginUseCase loginUseCase = null;
    private final com.rasalexman.hiltclean.domain.IValidateUserNameUseCase validateUserNameUseCase = null;
    private static final int MINIMUM_PASSWORD_LENGHT = 5;
    public static final com.rasalexman.hiltclean.presentation.login.LoginViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUserPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isButtonEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUserNameError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUserPasswordError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rasalexman.hiltclean.presentation.login.LoginResult> getLoginResult() {
        return null;
    }
    
    public final void login() {
    }
    
    public final void loginDataChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final boolean isPasswordValid(java.lang.String password) {
        return false;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.domain.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.domain.IValidateUserNameUseCase validateUserNameUseCase) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/rasalexman/hiltclean/presentation/login/LoginViewModel$Companion;", "", "()V", "MINIMUM_PASSWORD_LENGHT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}