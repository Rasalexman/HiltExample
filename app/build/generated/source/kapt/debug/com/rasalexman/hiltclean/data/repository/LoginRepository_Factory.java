package com.rasalexman.hiltclean.data.repository;

import com.rasalexman.hiltclean.data.datasource.local.LoginLocalDataSource;
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
public final class LoginRepository_Factory implements Factory<LoginRepository> {
  private final Provider<LoginLocalDataSource> dataSourceProvider;

  public LoginRepository_Factory(Provider<LoginLocalDataSource> dataSourceProvider) {
    this.dataSourceProvider = dataSourceProvider;
  }

  @Override
  public LoginRepository get() {
    return newInstance(dataSourceProvider.get());
  }

  public static LoginRepository_Factory create(Provider<LoginLocalDataSource> dataSourceProvider) {
    return new LoginRepository_Factory(dataSourceProvider);
  }

  public static LoginRepository newInstance(LoginLocalDataSource dataSource) {
    return new LoginRepository(dataSource);
  }
}
