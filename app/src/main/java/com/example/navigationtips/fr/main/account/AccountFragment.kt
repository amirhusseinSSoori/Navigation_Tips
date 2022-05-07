package com.example.navigationtips.fr.main.account

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationtips.databinding.FragmentAccountBinding
import com.example.navigationtips.util.base.BaseFragment
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AccountFragment : BaseFragment<FragmentAccountBinding>(FragmentAccountBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            navigationToAccount.setOnClickListener {
                val unameValue = editName.text.toString()
                val familyValue = editFamily.text.toString()
                val emailValue = editEmail.text.toString()

                val data = Gson().toJson(InformationModels(unameValue, familyValue, emailValue))

                val action = AccountFragmentDirections.actionAccountFragmentToInformationFragment(
                    data
                )
                findNavController().navigate(action)

            }
        }
    }
}
