package com.example.navigationtips.fr.main.account

import android.os.Bundle
import android.view.View
import com.example.navigationtips.databinding.FragmentAccountContainerBinding
import com.example.navigationtips.util.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AccountContainer : BaseFragment<FragmentAccountContainerBinding>(FragmentAccountContainerBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}