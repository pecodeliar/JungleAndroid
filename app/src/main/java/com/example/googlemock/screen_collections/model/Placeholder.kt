package com.example.googlemock.screen_collections.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Placeholder(
    val category: String,
    val verb: String,
    val background: Color,
    val button: String,
    @DrawableRes val graphic: Int
)
