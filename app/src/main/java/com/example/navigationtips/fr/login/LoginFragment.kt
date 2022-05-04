package com.example.navigationtips.fr.login

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationtips.R
import com.example.navigationtips.databinding.FragmentLoginBinding
import com.example.navigationtips.util.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment :BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showBottomNavigation(false)
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
        }
    }
}