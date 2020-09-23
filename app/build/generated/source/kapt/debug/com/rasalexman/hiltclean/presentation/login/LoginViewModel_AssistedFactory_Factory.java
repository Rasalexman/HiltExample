package com.rasalexman.hiltclean.presentation.login;

import com.rasalexman.hiltclean.domain.IValidateUserNameUseCase;
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

  private final Provider<IValidateUserNameUseCase> validateUserNameUseCaseProvider;

  public LoginViewModel_AssistedFactory_Factory(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<IValidateUserNameUseCase> validateUserNameUseCaseProvider) {
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.validateUserNameUseCaseProvider = validateUserNameUseCaseProvider;
  }

  @Override
  public LoginViewModel_AssistedFactory get() {
    return newInstance(loginUseCaseProvider, validateUserNameUseCaseProvider);
  }

  public static LoginViewModel_AssistedFactory_Factory create(
      Provider<LoginUseCase> loginUseCaseProvider,
      Provider<IValidateUserNameUseCase> validateUserNameUseCaseProvider) {
    return new LoginViewModel_AssistedFactory_Factory(loginUseCaseProvider, validateUserNameUseCaseProvider);
  }

  public static LoginViewModel_AssistedFactory newInstance(Provider<LoginUseCase> loginUseCase,
      Provider<IValidateUserNameUseCase> validateUserNameUseCase) {
    return new LoginViewModel_AssistedFactory(loginUseCase, validateUserNameUseCase);
  }
}
