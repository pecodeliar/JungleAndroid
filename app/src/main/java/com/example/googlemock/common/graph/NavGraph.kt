package com.example.googlemock.common.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.googlemock.common.model.Screen
import com.example.googlemock.screen_collections.presentation.CollectionsScreen
import com.example.googlemock.screen_discover.presentation.DiscoverScreen
import com.example.googlemock.screen_search.presentation.SearchScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Discover.route
    ) {
        composable(route = Screen.Discover.route) { DiscoverScreen(navController) }
        composable(route = Screen.Search.route) { SearchScreen(navController) }
        composable(route = Screen.Collections.route) { CollectionsScreen(navController) }
    }
}