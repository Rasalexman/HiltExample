package com.rasalexman.hiltclean.modules;

import com.rasalexman.hiltclean.providers.network.api.ITranslateApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProvidersModule_ProvideTranslateApiFactory implements Factory<ITranslateApi> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  public ProvidersModule_ProvideTranslateApiFactory(Provider<OkHttpClient> okHttpClientProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public ITranslateApi get() {
    return provideTranslateApi(okHttpClientProvider.get());
  }

  public static ProvidersModule_ProvideTranslateApiFactory create(
      Provider<OkHttpClient> okHttpClientProvider) {
    return new ProvidersModule_ProvideTranslateApiFactory(okHttpClientProvider);
  }

  public static ITranslateApi provideTranslateApi(OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(ProvidersModule.INSTANCE.provideTranslateApi(okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
