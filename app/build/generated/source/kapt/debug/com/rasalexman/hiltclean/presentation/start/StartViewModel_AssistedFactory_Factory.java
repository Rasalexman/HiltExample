package com.rasalexman.hiltclean.presentation.start;

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
public final class StartViewModel_AssistedFactory_Factory implements Factory<StartViewModel_AssistedFactory> {
  private final Provider<IUserPreference> userPreferenceProvider;

  public StartViewModel_AssistedFactory_Factory(Provider<IUserPreference> userPreferenceProvider) {
    this.userPreferenceProvider = userPreferenceProvider;
  }

  @Override
  public StartViewModel_AssistedFactory get() {
    return newInstance(userPreferenceProvider);
  }

  public static StartViewModel_AssistedFactory_Factory create(
      Provider<IUserPreference> userPreferenceProvider) {
    return new StartViewModel_AssistedFactory_Factory(userPreferenceProvider);
  }

  public static StartViewModel_AssistedFactory newInstance(
      Provider<IUserPreference> userPreference) {
    return new StartViewModel_AssistedFactory(userPreference);
  }
}
