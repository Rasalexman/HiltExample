package com.rasalexman.hiltclean.modules;

import android.app.Application;
import com.rasalexman.hiltclean.providers.preference.IUserPreference;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ProvidersModule_ProvideUserPreferenceFactory implements Factory<IUserPreference> {
  private final Provider<Application> applicationProvider;

  public ProvidersModule_ProvideUserPreferenceFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public IUserPreference get() {
    return provideUserPreference(applicationProvider.get());
  }

  public static ProvidersModule_ProvideUserPreferenceFactory create(
      Provider<Application> applicationProvider) {
    return new ProvidersModule_ProvideUserPreferenceFactory(applicationProvider);
  }

  public static IUserPreference provideUserPreference(Application application) {
    return Preconditions.checkNotNull(ProvidersModule.INSTANCE.provideUserPreference(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
