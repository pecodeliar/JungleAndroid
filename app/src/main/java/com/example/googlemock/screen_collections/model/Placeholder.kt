package com.example.googlemock.screen_collections.model

import androidx.annotation.DrawableRes

data class Placeholder(
    val category: String,
    val background: String,
    val button: String,
    @DrawableRes val graphic: Int
)
