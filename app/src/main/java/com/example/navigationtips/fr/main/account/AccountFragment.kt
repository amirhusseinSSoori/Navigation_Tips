package com.example.navigationtips.fr.main.account

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationtips.R
import com.example.navigationtips.databinding.FragmentAccountBinding
import com.example.navigationtips.databinding.FragmentAccountContainerBinding
import com.example.navigationtips.util.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AccountFragment : BaseFragment<FragmentAccountBinding>(FragmentAccountBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.navigationToAccount.setOnClickListener {
            val action = AccountFragmentDirections.actionAccountFragmentToInformationFragment(
                binding.editUserName.getText().toString()
            )
            findNavController().navigate(action)
        }
    }
}
