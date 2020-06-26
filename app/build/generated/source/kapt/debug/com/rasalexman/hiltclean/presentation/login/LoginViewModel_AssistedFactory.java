package com.rasalexman.hiltclean.presentation.login;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.rasalexman.hiltclean.domain.LoginUseCase;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class LoginViewModel_AssistedFactory implements ViewModelAssistedFactory<LoginViewModel> {
  private final Provider<LoginUseCase> loginUseCase;

  @Inject
  LoginViewModel_AssistedFactory(Provider<LoginUseCase> loginUseCase) {
    this.loginUseCase = loginUseCase;
  }

  @Override
  @NonNull
  public LoginViewModel create(@NonNull SavedStateHandle arg0) {
    return new LoginViewModel(loginUseCase.get());
  }
}
