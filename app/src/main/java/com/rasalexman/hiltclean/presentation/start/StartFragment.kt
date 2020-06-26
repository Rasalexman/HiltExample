package com.rasalexman.hiltclean.presentation.start

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.rasalexman.hiltclean.R
import com.rasalexman.hiltclean.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartFragment : BaseFragment<StartViewModel>() {

    override val layoutId: Int = R.layout.fragment_start
    override val viewModel: StartViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.resultLiveData.observe(viewLifecycleOwner) { navigationId ->
            findNavController().navigate(navigationId)
        }
    }
}