package com.example.navigationtips.util.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.navigationtips.MainActivity


typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

abstract class BaseFragment<VB : ViewBinding>(
    private val inflate: Inflate<VB>
) : Fragment() {
    private var _binding: VB? = null
    val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        showBottomNavigation(true)
        return _binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

     fun showBottomNavigation(visibility:Boolean) {
        if (activity is MainActivity) {
            val mainActivity = activity as MainActivity
            if(visibility){
                mainActivity.binding.bottomNav.setVisibilityWithAnimation(1.0f)
            }else{
                mainActivity.binding.bottomNav.setVisibilityWithAnimation(0.0f)
            }

        }
    }
}




