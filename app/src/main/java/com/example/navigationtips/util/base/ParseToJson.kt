package com.example.navigationtips.util.base

import com.google.gson.Gson
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi

inline fun <reified T> getArgByMoshi(json: String): T? {
    val moshi = Moshi.Builder().build()
    val jsonAdapter: JsonAdapter<T> =
        moshi.adapter(T::class.java)
    return jsonAdapter.fromJson(json)
}

inline fun <reified T> sendArgByMoshi(input: T): String {
    val moshi = Moshi.Builder().build()
    val jsonAdapter: JsonAdapter<T> =
        moshi.adapter(T::class.java)
    return jsonAdapter.toJson(input)
}

inline fun <reified T> getArgByGson(json: String): T {
    return Gson().fromJson(
        json,
        T::class.java
    )
}
inline fun <reified T> sendArgByGson(input: T): String {
    return Gson().toJson(
        input
    )
}


