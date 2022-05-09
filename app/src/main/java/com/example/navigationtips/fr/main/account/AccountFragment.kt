package com.example.navigationtips.fr.main.account

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationtips.databinding.FragmentAccountBinding
import com.example.navigationtips.fr.information.InformationModels

import com.example.navigationtips.util.base.BaseFragment
import com.example.navigationtips.util.base.sendArgByGson
import com.example.navigationtips.util.base.sendArgByMoshi
import com.google.gson.Gson
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
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

               val data = sendArgByMoshi(InformationModels(unameValue, familyValue, emailValue))
             //   val data = sendArgByGson(InformationModels(unameValue, familyValue, emailValue))

                val action = AccountFragmentDirections.actionAccountFragmentToInformationFragment(
                    data
                )
                findNavController().navigate(action)

            }
        }
    }
}
