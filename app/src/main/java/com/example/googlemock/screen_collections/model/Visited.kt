package com.example.googlemock.screen_collections.model

import androidx.annotation.DrawableRes

data class Visited(
    @DrawableRes val logo: Int,
    val name: String,
    val text: String = "Frequently Visited"
)
