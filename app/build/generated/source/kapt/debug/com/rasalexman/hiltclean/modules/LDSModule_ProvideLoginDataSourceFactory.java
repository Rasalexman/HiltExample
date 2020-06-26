package com.rasalexman.hiltclean.modules;

import com.rasalexman.hiltclean.data.datasource.local.LoginLocalDataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LDSModule_ProvideLoginDataSourceFactory implements Factory<LoginLocalDataSource> {
  @Override
  public LoginLocalDataSource get() {
    return provideLoginDataSource();
  }

  public static LDSModule_ProvideLoginDataSourceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LoginLocalDataSource provideLoginDataSource() {
    return Preconditions.checkNotNull(LDSModule.INSTANCE.provideLoginDataSource(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final LDSModule_ProvideLoginDataSourceFactory INSTANCE = new LDSModule_ProvideLoginDataSourceFactory();
  }
}
