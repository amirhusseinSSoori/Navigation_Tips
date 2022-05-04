package com.example.navigationtips.fr.main

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.navigationtips.R
import com.example.navigationtips.databinding.FragmentMainBinding
import com.example.navigationtips.util.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {
    private val navController: NavController
        get() {
            return Navigation.findNavController(requireActivity(), R.id.nav_login_fragment)
        }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        NavigationUI.setupWithNavController(binding.bottomNav, navController)
    }


}