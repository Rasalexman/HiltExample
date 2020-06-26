package com.rasalexman.hiltclean.presentation.start;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.rasalexman.hiltclean.providers.preference.IUserPreference;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class StartViewModel_AssistedFactory implements ViewModelAssistedFactory<StartViewModel> {
  private final Provider<IUserPreference> userPreference;

  @Inject
  StartViewModel_AssistedFactory(Provider<IUserPreference> userPreference) {
    this.userPreference = userPreference;
  }

  @Override
  @NonNull
  public StartViewModel create(@NonNull SavedStateHandle arg0) {
    return new StartViewModel(userPreference.get());
  }
}
