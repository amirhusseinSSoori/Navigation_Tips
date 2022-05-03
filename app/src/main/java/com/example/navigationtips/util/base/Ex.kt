package com.example.navigationtips.util.base

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.view.View

fun View.setVisibilityWithAnimation(fade:Float) {
    animate()
        .translationY(0f)
        .alpha(fade)
        .setDuration(300)
        .setListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
            }
        })
}
