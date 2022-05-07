package com.example.navigationtips.fr.information

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.example.navigationtips.databinding.FragmentInformationBinding
import com.example.navigationtips.util.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class InformationFragment : BaseFragment<FragmentInformationBinding>(FragmentInformationBinding::inflate) {
    private val viewModel:InformationViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.informationState.flowWithLifecycle(lifecycle, Lifecycle.State.CREATED).collect { info->
                info.apply {
                    binding.apply {
                        txtInformationName.text=name
                        txtInformationFamily.text=family
                        txtInformationEmails.text=emails
                    }
                }
            }
        }

    }


}