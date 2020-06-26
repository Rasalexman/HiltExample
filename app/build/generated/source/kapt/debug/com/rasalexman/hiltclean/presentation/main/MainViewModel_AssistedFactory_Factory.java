package com.rasalexman.hiltclean.presentation.main;

import com.rasalexman.hiltclean.domain.TranslateUseCase;
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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<TranslateUseCase> translateUseCaseProvider;

  private final Provider<IUserPreference> userPreferenceProvider;

  public MainViewModel_AssistedFactory_Factory(Provider<TranslateUseCase> translateUseCaseProvider,
      Provider<IUserPreference> userPreferenceProvider) {
    this.translateUseCaseProvider = translateUseCaseProvider;
    this.userPreferenceProvider = userPreferenceProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(translateUseCaseProvider, userPreferenceProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<TranslateUseCase> translateUseCaseProvider,
      Provider<IUserPreference> userPreferenceProvider) {
    return new MainViewModel_AssistedFactory_Factory(translateUseCaseProvider, userPreferenceProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(
      Provider<TranslateUseCase> translateUseCase, Provider<IUserPreference> userPreference) {
    return new MainViewModel_AssistedFactory(translateUseCase, userPreference);
  }
}
