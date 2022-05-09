package com.example.navigationtips.fr.information

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InformationModels(
    val name: String = "",
    val family: String = "",
    val emails: String = ""
)