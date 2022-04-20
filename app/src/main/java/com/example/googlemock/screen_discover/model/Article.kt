package com.example.googlemock.screen_discover.model

import androidx.annotation.DrawableRes

data class Article(
    @DrawableRes val logo: Int,
    @DrawableRes val image: Int,
    val title: String,
    val source: String,
    val date: String
)
