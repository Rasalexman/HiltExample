package com.rasalexman.hiltclean.application;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.rasalexman.hiltclean.MainActivity;
import com.rasalexman.hiltclean.data.datasource.local.LoginLocalDataSource;
import com.rasalexman.hiltclean.data.datasource.remote.ITranslateRemoteDataSource;
import com.rasalexman.hiltclean.data.datasource.remote.TranslateRemoteDataSource;
import com.rasalexman.hiltclean.data.repository.ITranslateRepository;
import com.rasalexman.hiltclean.data.repository.LoginRepository;
import com.rasalexman.hiltclean.data.repository.TranslateRepository;
import com.rasalexman.hiltclean.domain.IValidateUserNameUseCase;
import com.rasalexman.hiltclean.domain.LoginUseCase;
import com.rasalexman.hiltclean.domain.TranslateUseCase;
import com.rasalexman.hiltclean.modules.LDSModule;
import com.rasalexman.hiltclean.modules.LDSModule_ProvideLoginDataSourceFactory;
import com.rasalexman.hiltclean.modules.ProvidersModule;
import com.rasalexman.hiltclean.modules.ProvidersModule_ProvideOkHttpFactory;
import com.rasalexman.hiltclean.modules.ProvidersModule_ProvideTranslateApiFactory;
import com.rasalexman.hiltclean.modules.ProvidersModule_ProvideUserPreferenceFactory;
import com.rasalexman.hiltclean.modules.ProvidersModule_ProvideValidateNameUseCaseFactory;
import com.rasalexman.hiltclean.presentation.login.LoginFragment;
import com.rasalexman.hiltclean.presentation.login.LoginViewModel_AssistedFactory;
import com.rasalexman.hiltclean.presentation.login.LoginViewModel_AssistedFactory_Factory;
import com.rasalexman.hiltclean.presentation.main.MainFragment;
import com.rasalexman.hiltclean.presentation.main.MainViewModel_AssistedFactory;
import com.rasalexman.hiltclean.presentation.main.MainViewModel_AssistedFactory_Factory;
import com.rasalexman.hiltclean.presentation.start.StartFragment;
import com.rasalexman.hiltclean.presentation.start.StartViewModel_AssistedFactory;
import com.rasalexman.hiltclean.presentation.start.StartViewModel_AssistedFactory_Factory;
import com.rasalexman.hiltclean.providers.network.api.ITranslateApi;
import com.rasalexman.hiltclean.providers.preference.IUserPreference;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerHiltExampleApplication_HiltComponents_ApplicationC extends HiltExampleApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object loginLocalDataSource = new MemoizedSentinel();

  private volatile Object iUserPreference = new MemoizedSentinel();

  private volatile Object iValidateUserNameUseCase = new MemoizedSentinel();

  private volatile Provider<IValidateUserNameUseCase> provideValidateNameUseCaseProvider;

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object iTranslateApi = new MemoizedSentinel();

  private volatile Object iTranslateRemoteDataSource = new MemoizedSentinel();

  private volatile Object iTranslateRepository = new MemoizedSentinel();

  private volatile Provider<IUserPreference> provideUserPreferenceProvider;

  private DaggerHiltExampleApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private LoginLocalDataSource getLoginLocalDataSource() {
    Object local = loginLocalDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = loginLocalDataSource;
        if (local instanceof MemoizedSentinel) {
          local = LDSModule_ProvideLoginDataSourceFactory.provideLoginDataSource();
          loginLocalDataSource = DoubleCheck.reentrantCheck(loginLocalDataSource, local);
        }
      }
    }
    return (LoginLocalDataSource) local;
  }

  private IUserPreference getIUserPreference() {
    Object local = iUserPreference;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = iUserPreference;
        if (local instanceof MemoizedSentinel) {
          local = ProvidersModule_ProvideUserPreferenceFactory.provideUserPreference(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          iUserPreference = DoubleCheck.reentrantCheck(iUserPreference, local);
        }
      }
    }
    return (IUserPreference) local;
  }

  private IValidateUserNameUseCase getIValidateUserNameUseCase() {
    Object local = iValidateUserNameUseCase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = iValidateUserNameUseCase;
        if (local instanceof MemoizedSentinel) {
          local = ProvidersModule_ProvideValidateNameUseCaseFactory.provideValidateNameUseCase();
          iValidateUserNameUseCase = DoubleCheck.reentrantCheck(iValidateUserNameUseCase, local);
        }
      }
    }
    return (IValidateUserNameUseCase) local;
  }

  private Provider<IValidateUserNameUseCase> getIValidateUserNameUseCaseProvider() {
    Object local = provideValidateNameUseCaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideValidateNameUseCaseProvider = (Provider<IValidateUserNameUseCase>) local;
    }
    return (Provider<IValidateUserNameUseCase>) local;
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = ProvidersModule_ProvideOkHttpFactory.provideOkHttp();
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private ITranslateApi getITranslateApi() {
    Object local = iTranslateApi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = iTranslateApi;
        if (local instanceof MemoizedSentinel) {
          local = ProvidersModule_ProvideTranslateApiFactory.provideTranslateApi(getOkHttpClient());
          iTranslateApi = DoubleCheck.reentrantCheck(iTranslateApi, local);
        }
      }
    }
    return (ITranslateApi) local;
  }

  private TranslateRemoteDataSource getTranslateRemoteDataSource() {
    return new TranslateRemoteDataSource(getITranslateApi());
  }

  private ITranslateRemoteDataSource getITranslateRemoteDataSource() {
    Object local = iTranslateRemoteDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = iTranslateRemoteDataSource;
        if (local instanceof MemoizedSentinel) {
          local = getTranslateRemoteDataSource();
          iTranslateRemoteDataSource = DoubleCheck.reentrantCheck(iTranslateRemoteDataSource, local);
        }
      }
    }
    return (ITranslateRemoteDataSource) local;
  }

  private TranslateRepository getTranslateRepository() {
    return new TranslateRepository(getITranslateRemoteDataSource());
  }

  private ITranslateRepository getITranslateRepository() {
    Object local = iTranslateRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = iTranslateRepository;
        if (local instanceof MemoizedSentinel) {
          local = getTranslateRepository();
          iTranslateRepository = DoubleCheck.reentrantCheck(iTranslateRepository, local);
        }
      }
    }
    return (ITranslateRepository) local;
  }

  private Provider<IUserPreference> getIUserPreferenceProvider() {
    Object local = provideUserPreferenceProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      provideUserPreferenceProvider = (Provider<IUserPreference>) local;
    }
    return (Provider<IUserPreference>) local;
  }

  @Override
  public void injectHiltExampleApplication(HiltExampleApplication hiltExampleApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder lDSModule(LDSModule lDSModule) {
      Preconditions.checkNotNull(lDSModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder providersModule(ProvidersModule providersModule) {
      Preconditions.checkNotNull(providersModule);
      return this;
    }

    public HiltExampleApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerHiltExampleApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements HiltExampleApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public HiltExampleApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends HiltExampleApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements HiltExampleApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public HiltExampleApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends HiltExampleApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<LoginUseCase> loginUseCaseProvider;

      private volatile Provider<LoginViewModel_AssistedFactory> loginViewModel_AssistedFactoryProvider;

      private volatile Provider<TranslateUseCase> translateUseCaseProvider;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private volatile Provider<StartViewModel_AssistedFactory> startViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private LoginRepository getLoginRepository() {
        return new LoginRepository(DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.getLoginLocalDataSource());
      }

      private LoginUseCase getLoginUseCase() {
        return new LoginUseCase(getLoginRepository(), DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.getIUserPreference());
      }

      private Provider<LoginUseCase> getLoginUseCaseProvider() {
        Object local = loginUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          loginUseCaseProvider = (Provider<LoginUseCase>) local;
        }
        return (Provider<LoginUseCase>) local;
      }

      private LoginViewModel_AssistedFactory getLoginViewModel_AssistedFactory() {
        return LoginViewModel_AssistedFactory_Factory.newInstance(getLoginUseCaseProvider(), DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.getIValidateUserNameUseCaseProvider());
      }

      private Provider<LoginViewModel_AssistedFactory> getLoginViewModel_AssistedFactoryProvider() {
        Object local = loginViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          loginViewModel_AssistedFactoryProvider = (Provider<LoginViewModel_AssistedFactory>) local;
        }
        return (Provider<LoginViewModel_AssistedFactory>) local;
      }

      private TranslateUseCase getTranslateUseCase() {
        return new TranslateUseCase(DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.getITranslateRepository());
      }

      private Provider<TranslateUseCase> getTranslateUseCaseProvider() {
        Object local = translateUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          translateUseCaseProvider = (Provider<TranslateUseCase>) local;
        }
        return (Provider<TranslateUseCase>) local;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return MainViewModel_AssistedFactory_Factory.newInstance(getTranslateUseCaseProvider(), DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.getIUserPreferenceProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private StartViewModel_AssistedFactory getStartViewModel_AssistedFactory() {
        return StartViewModel_AssistedFactory_Factory.newInstance(DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.getIUserPreferenceProvider());
      }

      private Provider<StartViewModel_AssistedFactory> getStartViewModel_AssistedFactoryProvider() {
        Object local = startViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          startViewModel_AssistedFactoryProvider = (Provider<StartViewModel_AssistedFactory>) local;
        }
        return (Provider<StartViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(3).put("com.rasalexman.hiltclean.presentation.login.LoginViewModel", (Provider) getLoginViewModel_AssistedFactoryProvider()).put("com.rasalexman.hiltclean.presentation.main.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider()).put("com.rasalexman.hiltclean.presentation.start.StartViewModel", (Provider) getStartViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements HiltExampleApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public HiltExampleApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends HiltExampleApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectLoginFragment(LoginFragment loginFragment) {
        }

        @Override
        public void injectMainFragment(MainFragment mainFragment) {
        }

        @Override
        public void injectStartFragment(StartFragment startFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements HiltExampleApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public HiltExampleApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends HiltExampleApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements HiltExampleApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public HiltExampleApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends HiltExampleApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.rasalexman.hiltclean.presentation.login.LoginViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getLoginViewModel_AssistedFactory();

            case 1: // com.rasalexman.hiltclean.domain.LoginUseCase 
            return (T) ActivityCImpl.this.getLoginUseCase();

            case 2: // com.rasalexman.hiltclean.presentation.main.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            case 3: // com.rasalexman.hiltclean.domain.TranslateUseCase 
            return (T) ActivityCImpl.this.getTranslateUseCase();

            case 4: // com.rasalexman.hiltclean.presentation.start.StartViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getStartViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements HiltExampleApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public HiltExampleApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends HiltExampleApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.rasalexman.hiltclean.domain.IValidateUserNameUseCase 
        return (T) DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.getIValidateUserNameUseCase();

        case 1: // com.rasalexman.hiltclean.providers.preference.IUserPreference 
        return (T) DaggerHiltExampleApplication_HiltComponents_ApplicationC.this.getIUserPreference();

        default: throw new AssertionError(id);
      }
    }
  }
}
