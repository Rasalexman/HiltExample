package com.rasalexman.hiltclean.presentation.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u001a\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u0006H\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\u00038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/rasalexman/hiltclean/presentation/login/LoginFragment;", "Lcom/rasalexman/hiltclean/presentation/base/BaseBindingFragment;", "Lcom/rasalexman/hiltclean/databinding/FragmentLoginBinding;", "Lcom/rasalexman/hiltclean/presentation/login/LoginViewModel;", "()V", "layoutId", "", "getLayoutId", "()I", "viewModel", "getViewModel", "()Lcom/rasalexman/hiltclean/presentation/login/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initBinding", "", "binding", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showLoginFailed", "errorString", "updateUiWithUser", "model", "Lcom/rasalexman/hiltclean/presentation/login/LoggedInUserView;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginFragment extends com.rasalexman.hiltclean.presentation.base.BaseBindingFragment<com.rasalexman.hiltclean.databinding.FragmentLoginBinding, com.rasalexman.hiltclean.presentation.login.LoginViewModel> {
    private final int layoutId = com.rasalexman.hiltclean.R.layout.fragment_login;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rasalexman.hiltclean.presentation.login.LoginViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void initBinding(@org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.databinding.FragmentLoginBinding binding) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateUiWithUser(com.rasalexman.hiltclean.presentation.login.LoggedInUserView model) {
    }
    
    private final void showLoginFailed(@androidx.annotation.StringRes()
    int errorString) {
    }
    
    public LoginFragment() {
        super();
    }
}