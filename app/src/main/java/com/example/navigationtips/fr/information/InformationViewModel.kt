package com.example.navigationtips.fr.information

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.navigationtips.util.base.getArgByGson
import com.example.navigationtips.util.base.getArgByMoshi
import com.google.gson.Gson
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject


@HiltViewModel
class InformationViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val _informationState = MutableStateFlow(InformationModels())
    val informationState = _informationState.stateIn(
        viewModelScope, SharingStarted.Eagerly,
        InformationModels()
    )



    init {
        getArgByMoshi<InformationModels>(savedStateHandle.get<String>("information") ?: "")?.let {
            _informationState.value = it
        }

//        getArgByGson<InformationModels>(savedStateHandle.get<String>("information") ?: "").let {
//            _informationState.value = it
//        }



}




}




