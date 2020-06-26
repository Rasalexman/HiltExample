package com.rasalexman.hiltclean.presentation.login;

import com.rasalexman.hiltclean.domain.LoginUseCase;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_AssistedFactory_Factory implements Factory<LoginViewModel_AssistedFactory> {
  private final Provider<LoginUseCase> loginUseCaseProvider;

  public LoginViewModel_AssistedFactory_Factory(Provider<LoginUseCase> loginUseCaseProvider) {
    this.loginUseCaseProvider = loginUseCaseProvider;
  }

  @Override
  public LoginViewModel_AssistedFactory get() {
    return newInstance(loginUseCaseProvider);
  }

  public static LoginViewModel_AssistedFactory_Factory create(
      Provider<LoginUseCase> loginUseCaseProvider) {
    return new LoginViewModel_AssistedFactory_Factory(loginUseCaseProvider);
  }

  public static LoginViewModel_AssistedFactory newInstance(Provider<LoginUseCase> loginUseCase) {
    return new LoginViewModel_AssistedFactory(loginUseCase);
  }
}
