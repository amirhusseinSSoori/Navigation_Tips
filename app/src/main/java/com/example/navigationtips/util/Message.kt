package com.example.navigationtips.util

class Message(val id: Int, val content: Any, val callback: () -> Unit) {
    companion object {
        val IDS = listOf(0, 1, 2)
    }
}
