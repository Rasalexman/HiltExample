package com.rasalexman.hiltclean.data.repository;

import com.rasalexman.hiltclean.data.datasource.remote.ITranslateRemoteDataSource;
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
public final class TranslateRepository_Factory implements Factory<TranslateRepository> {
  private final Provider<ITranslateRemoteDataSource> remoteDataSourceProvider;

  public TranslateRepository_Factory(
      Provider<ITranslateRemoteDataSource> remoteDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public TranslateRepository get() {
    return newInstance(remoteDataSourceProvider.get());
  }

  public static TranslateRepository_Factory create(
      Provider<ITranslateRemoteDataSource> remoteDataSourceProvider) {
    return new TranslateRepository_Factory(remoteDataSourceProvider);
  }

  public static TranslateRepository newInstance(ITranslateRemoteDataSource remoteDataSource) {
    return new TranslateRepository(remoteDataSource);
  }
}
