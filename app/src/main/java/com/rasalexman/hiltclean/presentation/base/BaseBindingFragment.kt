package com.rasalexman.hiltclean.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BaseBindingFragment<B : ViewDataBinding, VM : ViewModel> : BaseFragment<VM>() {

    protected var binding: B? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return DataBindingUtil.inflate<B>(inflater, layoutId,  container, false).also{
            binding = it
            it.lifecycleOwner = viewLifecycleOwner
            initBinding(it)
        }.root
    }

    open fun initBinding(binding: B) = Unit

    override fun onDestroyView() {
        binding?.unbind()
        binding = null
        super.onDestroyView()
    }
}