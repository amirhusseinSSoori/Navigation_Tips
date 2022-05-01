package com.example.navigationtips.fr.information

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.example.navigationtips.databinding.FragmentInformationBinding
import com.example.navigationtips.util.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InformationFragment : BaseFragment<FragmentInformationBinding>(FragmentInformationBinding::inflate) {

    private val viewModel:InformationViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtInformation.text=viewModel.str

    }
}