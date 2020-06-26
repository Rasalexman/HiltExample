package com.rasalexman.hiltclean.data.datasource.remote;

import com.rasalexman.hiltclean.providers.network.api.ITranslateApi;
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
public final class TranslateRemoteDataSource_Factory implements Factory<TranslateRemoteDataSource> {
  private final Provider<ITranslateApi> translateApiProvider;

  public TranslateRemoteDataSource_Factory(Provider<ITranslateApi> translateApiProvider) {
    this.translateApiProvider = translateApiProvider;
  }

  @Override
  public TranslateRemoteDataSource get() {
    return newInstance(translateApiProvider.get());
  }

  public static TranslateRemoteDataSource_Factory create(
      Provider<ITranslateApi> translateApiProvider) {
    return new TranslateRemoteDataSource_Factory(translateApiProvider);
  }

  public static TranslateRemoteDataSource newInstance(ITranslateApi translateApi) {
    return new TranslateRemoteDataSource(translateApi);
  }
}
