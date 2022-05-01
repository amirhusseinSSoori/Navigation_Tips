package com.example.navigationtips.fr.information

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class InformationViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {
    var str: String = ""

    init {
        savedStateHandle.get<String>("username")?.let { str ->
            this.str = str
        }
    }


}