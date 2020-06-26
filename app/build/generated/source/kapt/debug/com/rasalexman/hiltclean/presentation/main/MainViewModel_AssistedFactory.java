package com.rasalexman.hiltclean.presentation.main;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.rasalexman.hiltclean.domain.TranslateUseCase;
import com.rasalexman.hiltclean.providers.preference.IUserPreference;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<TranslateUseCase> translateUseCase;

  private final Provider<IUserPreference> userPreference;

  @Inject
  MainViewModel_AssistedFactory(Provider<TranslateUseCase> translateUseCase,
      Provider<IUserPreference> userPreference) {
    this.translateUseCase = translateUseCase;
    this.userPreference = userPreference;
  }

  @Override
  @NonNull
  public MainViewModel create(@NonNull SavedStateHandle arg0) {
    return new MainViewModel(translateUseCase.get(), userPreference.get());
  }
}
