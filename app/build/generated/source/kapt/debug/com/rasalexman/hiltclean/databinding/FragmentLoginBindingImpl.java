package com.rasalexman.hiltclean.databinding;
import com.rasalexman.hiltclean.R;
import com.rasalexman.hiltclean.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.rasalexman.hiltclean.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loadingProgressBar, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener passwordEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.userPassword.getValue()
            //         is viewModel.userPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(passwordEditText);
            // localize variables for thread safety
            // viewModel.userPassword != null
            boolean viewModelUserPasswordJavaLangObjectNull = false;
            // viewModel.userPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUserPassword = null;
            // viewModel
            com.rasalexman.hiltclean.presentation.login.LoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.userPassword.getValue()
            java.lang.String viewModelUserPasswordGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUserPassword = viewModel.getUserPassword();

                viewModelUserPasswordJavaLangObjectNull = (viewModelUserPassword) != (null);
                if (viewModelUserPasswordJavaLangObjectNull) {




                    viewModelUserPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener usernameEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.userName.getValue()
            //         is viewModel.userName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(usernameEditText);
            // localize variables for thread safety
            // viewModel.userName
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUserName = null;
            // viewModel.userName.getValue()
            java.lang.String viewModelUserNameGetValue = null;
            // viewModel.userName != null
            boolean viewModelUserNameJavaLangObjectNull = false;
            // viewModel
            com.rasalexman.hiltclean.presentation.login.LoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUserName = viewModel.getUserName();

                viewModelUserNameJavaLangObjectNull = (viewModelUserName) != (null);
                if (viewModelUserNameJavaLangObjectNull) {




                    viewModelUserName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[4]
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            );
        this.container.setTag(null);
        this.loginButton.setTag(null);
        this.passwordEditText.setTag(null);
        this.usernameEditText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.rasalexman.hiltclean.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.rasalexman.hiltclean.presentation.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rasalexman.hiltclean.presentation.login.LoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUserPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelUserNameError((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeViewModelUserPasswordError((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeViewModelIsButtonEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUserPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUserPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUserName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUserNameError(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelUserNameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUserPasswordError(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelUserPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsButtonEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsButtonEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUserPassword = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUserName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelUserNameError = null;
        java.lang.String viewModelUserNameGetValue = null;
        java.lang.String viewModelUserPasswordGetValue = null;
        java.lang.Integer viewModelUserNameErrorGetValue = null;
        java.lang.Integer viewModelUserPasswordErrorGetValue = null;
        java.lang.Boolean viewModelIsButtonEnabledGetValue = null;
        com.rasalexman.hiltclean.presentation.login.LoginViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelUserPasswordError = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsButtonEnabled = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsButtonEnabledGetValue = false;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userPassword
                        viewModelUserPassword = viewModel.getUserPassword();
                    }
                    updateLiveDataRegistration(0, viewModelUserPassword);


                    if (viewModelUserPassword != null) {
                        // read viewModel.userPassword.getValue()
                        viewModelUserPasswordGetValue = viewModelUserPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userName
                        viewModelUserName = viewModel.getUserName();
                    }
                    updateLiveDataRegistration(1, viewModelUserName);


                    if (viewModelUserName != null) {
                        // read viewModel.userName.getValue()
                        viewModelUserNameGetValue = viewModelUserName.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userNameError
                        viewModelUserNameError = viewModel.getUserNameError();
                    }
                    updateLiveDataRegistration(2, viewModelUserNameError);


                    if (viewModelUserNameError != null) {
                        // read viewModel.userNameError.getValue()
                        viewModelUserNameErrorGetValue = viewModelUserNameError.getValue();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.userPasswordError
                        viewModelUserPasswordError = viewModel.getUserPasswordError();
                    }
                    updateLiveDataRegistration(3, viewModelUserPasswordError);


                    if (viewModelUserPasswordError != null) {
                        // read viewModel.userPasswordError.getValue()
                        viewModelUserPasswordErrorGetValue = viewModelUserPasswordError.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isButtonEnabled
                        viewModelIsButtonEnabled = viewModel.isButtonEnabled();
                    }
                    updateLiveDataRegistration(4, viewModelIsButtonEnabled);


                    if (viewModelIsButtonEnabled != null) {
                        // read viewModel.isButtonEnabled.getValue()
                        viewModelIsButtonEnabledGetValue = viewModelIsButtonEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isButtonEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsButtonEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsButtonEnabledGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.loginButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelIsButtonEnabledGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.loginButton.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.passwordEditText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, passwordEditTextandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.usernameEditText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, usernameEditTextandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.passwordEditText, viewModelUserPasswordGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.rasalexman.hiltclean.presentation.base.BindAdapter.onError(this.passwordEditText, viewModelUserPasswordErrorGetValue);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.usernameEditText, viewModelUserNameGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            com.rasalexman.hiltclean.presentation.base.BindAdapter.onError(this.usernameEditText, viewModelUserNameErrorGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.rasalexman.hiltclean.presentation.login.LoginViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.login();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.userPassword
        flag 1 (0x2L): viewModel.userName
        flag 2 (0x3L): viewModel.userNameError
        flag 3 (0x4L): viewModel.userPasswordError
        flag 4 (0x5L): viewModel.isButtonEnabled
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}