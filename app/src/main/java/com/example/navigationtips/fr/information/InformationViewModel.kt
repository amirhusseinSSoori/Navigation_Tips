package com.example.navigationtips.fr.information

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigationtips.fr.main.account.InformationModels
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class InformationViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {


    private val _informationState = MutableStateFlow(InformationModels())
    val informationState = _informationState.stateIn(viewModelScope, SharingStarted.Eagerly,InformationModels())

    init {
        Gson().fromJson(
            savedStateHandle.get<String>("information"),
            InformationModels::class.java
        )?.let {
            _informationState.value = it
        }
    }


}