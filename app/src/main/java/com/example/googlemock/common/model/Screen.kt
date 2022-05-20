package com.example.googlemock.common.model

import androidx.annotation.DrawableRes
import com.example.googlemock.R

sealed class Screen(
    val route: String,
    val title: String,
    @DrawableRes val icon: Int
    ) {
    object Discover: Screen(
        route = "discover_screen",
        "Discover",
        icon = R.drawable.dsc_nav
    )
    object Search: Screen(
        route = "search_screen",
        "Search",
        R.drawable.cmn_mag_glss
    )
    object Collections: Screen(
        route = "collections_screen",
        "Collections",
        R.drawable.col_nav
    )
}
