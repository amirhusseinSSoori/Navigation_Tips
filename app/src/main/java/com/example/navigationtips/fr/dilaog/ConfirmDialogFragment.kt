package com.example.navigationtips.fr.dilaog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import com.example.navigationtips.R
import com.example.navigationtips.databinding.FragmentConfirmDialogBinding
import com.example.navigationtips.util.Message
import com.example.navigationtips.util.NotificationCenter
import com.example.navigationtips.util.base.BaseDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConfirmDialogFragment :
    BaseDialogFragment<FragmentConfirmDialogBinding>(FragmentConfirmDialogBinding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnYes.setOnClickListener {
            NotificationCenter.notifySubscribers(Message(1, "you cant"){
                //no callBack
            })
            dismiss()
        }
        binding.btnNo.setOnClickListener {
            dismiss()
        }
    }


}



