package com.rasalexman.hiltclean.databinding;
import com.rasalexman.hiltclean.R;
import com.rasalexman.hiltclean.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentMainBindingImpl extends FragmentMainBinding implements com.rasalexman.hiltclean.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBarLayout, 7);
        sViewsWithIds.put(R.id.selectLangLayout, 8);
        sViewsWithIds.put(R.id.delimView, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageButton mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener phraseTextInputandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.inputText.getValue()
            //         is viewModel.inputText.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(phraseTextInput);
            // localize variables for thread safety
            // viewModel.inputText
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelInputText = null;
            // viewModel.inputText.getValue()
            java.lang.String viewModelInputTextGetValue = null;
            // viewModel.inputText != null
            boolean viewModelInputTextJavaLangObjectNull = false;
            // viewModel
            com.rasalexman.hiltclean.presentation.main.MainViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelInputText = viewModel.getInputText();

                viewModelInputTextJavaLangObjectNull = (viewModelInputText) != (null);
                if (viewModelInputTextJavaLangObjectNull) {




                    viewModelInputText.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (com.google.android.material.appbar.AppBarLayout) bindings[7]
            , (android.view.View) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.LinearLayout) bindings[8]
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ImageButton) bindings[2];
        this.mboundView2.setTag(null);
        this.phraseTextInput.setTag(null);
        this.progressBar.setTag(null);
        this.selectedLangButton.setTag(null);
        this.targetLangButton.setTag(null);
        this.translatedTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.rasalexman.hiltclean.generated.callback.OnClickListener(this, 1);
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
            setViewModel((com.rasalexman.hiltclean.presentation.main.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.rasalexman.hiltclean.presentation.main.MainViewModel ViewModel) {
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
                return onChangeViewModelIsLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelInputText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelSelectedLang((androidx.lifecycle.MutableLiveData<java.util.Locale>) object, fieldId);
            case 3 :
                return onChangeViewModelTranslatedText((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelTargetLang((androidx.lifecycle.MutableLiveData<java.util.Locale>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelInputText(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelInputText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectedLang(androidx.lifecycle.MutableLiveData<java.util.Locale> ViewModelSelectedLang, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTranslatedText(androidx.lifecycle.LiveData<java.lang.String> ViewModelTranslatedText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTargetLang(androidx.lifecycle.MutableLiveData<java.util.Locale> ViewModelTargetLang, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoading = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelInputText = null;
        androidx.lifecycle.MutableLiveData<java.util.Locale> viewModelSelectedLang = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelTranslatedText = null;
        androidx.lifecycle.MutableLiveData<java.util.Locale> viewModelTargetLang = null;
        java.lang.String viewModelTranslatedTextGetValue = null;
        java.util.Locale viewModelTargetLangGetValue = null;
        java.util.Locale viewModelSelectedLangGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        java.lang.String viewModelInputTextGetValue = null;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTargetLangDisplayName = null;
        com.rasalexman.hiltclean.presentation.main.MainViewModel viewModel = mViewModel;
        java.lang.String viewModelSelectedLangDisplayName = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading()
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(0, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading().getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.inputText
                        viewModelInputText = viewModel.getInputText();
                    }
                    updateLiveDataRegistration(1, viewModelInputText);


                    if (viewModelInputText != null) {
                        // read viewModel.inputText.getValue()
                        viewModelInputTextGetValue = viewModelInputText.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedLang
                        viewModelSelectedLang = viewModel.getSelectedLang();
                    }
                    updateLiveDataRegistration(2, viewModelSelectedLang);


                    if (viewModelSelectedLang != null) {
                        // read viewModel.selectedLang.getValue()
                        viewModelSelectedLangGetValue = viewModelSelectedLang.getValue();
                    }


                    if (viewModelSelectedLangGetValue != null) {
                        // read viewModel.selectedLang.getValue().displayName
                        viewModelSelectedLangDisplayName = viewModelSelectedLangGetValue.getDisplayName();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.translatedText
                        viewModelTranslatedText = viewModel.getTranslatedText();
                    }
                    updateLiveDataRegistration(3, viewModelTranslatedText);


                    if (viewModelTranslatedText != null) {
                        // read viewModel.translatedText.getValue()
                        viewModelTranslatedTextGetValue = viewModelTranslatedText.getValue();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.targetLang
                        viewModelTargetLang = viewModel.getTargetLang();
                    }
                    updateLiveDataRegistration(4, viewModelTargetLang);


                    if (viewModelTargetLang != null) {
                        // read viewModel.targetLang.getValue()
                        viewModelTargetLangGetValue = viewModelTargetLang.getValue();
                    }


                    if (viewModelTargetLangGetValue != null) {
                        // read viewModel.targetLang.getValue().displayName
                        viewModelTargetLangDisplayName = viewModelTargetLangGetValue.getDisplayName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.phraseTextInput, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, phraseTextInputandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phraseTextInput, viewModelInputTextGetValue);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.selectedLangButton, viewModelSelectedLangDisplayName);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.targetLangButton, viewModelTargetLangDisplayName);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.translatedTextView, viewModelTranslatedTextGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.rasalexman.hiltclean.presentation.main.MainViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.switchLanguages();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoading()
        flag 1 (0x2L): viewModel.inputText
        flag 2 (0x3L): viewModel.selectedLang
        flag 3 (0x4L): viewModel.translatedText
        flag 4 (0x5L): viewModel.targetLang
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading().getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}