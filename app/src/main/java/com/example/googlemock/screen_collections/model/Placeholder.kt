package com.example.googlemock.screen_collections.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.googlemock.R
import com.example.googlemock.ui.theme.BooksCard
import com.example.googlemock.ui.theme.RecipesCard
import com.example.googlemock.ui.theme.ShowsCard

enum class Placeholder (
    val category: String,
    val verb: String,
    val background: Color,
    val button: String,
    @DrawableRes val graphic: Int

    ) {

    SHOWS(
        "shows and movies",
        "watch",
        ShowsCard,
        "watchlist",
        R.drawable.plc_movie
    ),
    RECIPES(
        "recipes",
        "cook",
        RecipesCard,
        "cookbook",
        R.drawable.plc_written
    ),
    BOOKS(
        "books",
        "read",
        BooksCard,
        "reading list",
        R.drawable.plc_written
    )

}