package com.rasalexman.hiltclean.domain;

import com.rasalexman.hiltclean.data.repository.ITranslateRepository;
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
public final class TranslateUseCase_Factory implements Factory<TranslateUseCase> {
  private final Provider<ITranslateRepository> translateRepositoryProvider;

  public TranslateUseCase_Factory(Provider<ITranslateRepository> translateRepositoryProvider) {
    this.translateRepositoryProvider = translateRepositoryProvider;
  }

  @Override
  public TranslateUseCase get() {
    return newInstance(translateRepositoryProvider.get());
  }

  public static TranslateUseCase_Factory create(
      Provider<ITranslateRepository> translateRepositoryProvider) {
    return new TranslateUseCase_Factory(translateRepositoryProvider);
  }

  public static TranslateUseCase newInstance(ITranslateRepository translateRepository) {
    return new TranslateUseCase(translateRepository);
  }
}
