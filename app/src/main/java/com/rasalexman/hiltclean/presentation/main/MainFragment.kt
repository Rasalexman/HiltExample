package com.rasalexman.hiltclean.presentation.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.rasalexman.hiltclean.R
import com.rasalexman.hiltclean.common.consts.Consts
import com.rasalexman.hiltclean.common.extensions.toast
import com.rasalexman.hiltclean.databinding.FragmentMainBinding
import com.rasalexman.hiltclean.presentation.base.BaseBindingFragment
import com.rasalexman.hiltclean.presentation.main.dialog.SelectLanguageDialog
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*

@AndroidEntryPoint
class MainFragment : BaseBindingFragment<FragmentMainBinding, MainViewModel>() {

    override val layoutId: Int get() = R.layout.fragment_main
    override val viewModel: MainViewModel by viewModels()

    override fun initBinding(binding: FragmentMainBinding) {
        binding.viewModel = viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.errorResult.observe(viewLifecycleOwner) {
            requireContext().toast(it)
        }

        setFragmentResultListener(SelectLanguageDialog.TAG) { _, bundle ->
            val selectedLangIndex = bundle.getInt(SelectLanguageDialog.SELECTED_LANG_INDEX)
            val langType = bundle.getString(SelectLanguageDialog.LANG_TYPE, Consts.SELECTED_LANG_TYPE)
            viewModel.updateLangByType(selectedLangIndex, langType)
        }

        selectedLangButton.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.showSelectLanguageDialog(Consts.SELECTED_LANG_TYPE))
        }
        targetLangButton.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.showSelectLanguageDialog(Consts.TARGET_LANG_TYPE))
        }
    }
}