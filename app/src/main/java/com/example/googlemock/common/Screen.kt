package com.example.googlemock.common

sealed class Screen(val route: String) {
    object Discover: Screen(route = "discover_screen")
    object Search: Screen(route = "search_screen")
    object Collections: Screen(route = "collections_screen")
}
