package com.rasalexman.hiltclean.presentation.start;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = StartViewModel.class
)
public interface StartViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.rasalexman.hiltclean.presentation.start.StartViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(StartViewModel_AssistedFactory factory);
}
