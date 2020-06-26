package com.rasalexman.hiltclean.domain;

import com.rasalexman.hiltclean.data.repository.LoginRepository;
import com.rasalexman.hiltclean.providers.preference.IUserPreference;
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
public final class LoginUseCase_Factory implements Factory<LoginUseCase> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  private final Provider<IUserPreference> userPreferenceProvider;

  public LoginUseCase_Factory(Provider<LoginRepository> loginRepositoryProvider,
      Provider<IUserPreference> userPreferenceProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
    this.userPreferenceProvider = userPreferenceProvider;
  }

  @Override
  public LoginUseCase get() {
    return newInstance(loginRepositoryProvider.get(), userPreferenceProvider.get());
  }

  public static LoginUseCase_Factory create(Provider<LoginRepository> loginRepositoryProvider,
      Provider<IUserPreference> userPreferenceProvider) {
    return new LoginUseCase_Factory(loginRepositoryProvider, userPreferenceProvider);
  }

  public static LoginUseCase newInstance(LoginRepository loginRepository,
      IUserPreference userPreference) {
    return new LoginUseCase(loginRepository, userPreference);
  }
}
