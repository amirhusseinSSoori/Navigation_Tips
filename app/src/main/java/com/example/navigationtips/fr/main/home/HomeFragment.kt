package com.example.navigationtips.fr.main.home

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navigationtips.R
import com.example.navigationtips.databinding.FragmentHomeBinding
import com.example.navigationtips.util.Message
import com.example.navigationtips.util.NotificationCenter
import com.example.navigationtips.util.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate),
    NotificationCenter.NotificationCenterDelegate {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNavSearch.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_userFragment)
        }

        binding.btnLogOut.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_confirmDialogFragment)
        }

    }

    override fun onResume() {
        super.onResume()
        NotificationCenter.subscribe(this, 1)
    }


    override fun onDestroy() {
        super.onDestroy()
        NotificationCenter.unSubscribe(this, 1)
    }

    override fun receiveData(msg: Message) {
        binding.textView.text = msg.content.toString()
    }


}