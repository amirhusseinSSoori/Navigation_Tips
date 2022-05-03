package com.example.navigationtips.fr.main.home

import android.os.Bundle
import android.view.View
import com.example.navigationtips.databinding.FragmentHomeBinding
import com.example.navigationtips.util.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment: BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}