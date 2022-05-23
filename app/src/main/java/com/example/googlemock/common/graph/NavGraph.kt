package com.example.googlemock.common.graph

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.googlemock.common.components.BottomBar
import com.example.googlemock.common.model.Screen
import com.example.googlemock.screen_collections.presentation.CollectionsScreen
import com.example.googlemock.screen_discover.components.PreferenceMenu
import com.example.googlemock.screen_discover.presentation.DiscoverScreen
import com.example.googlemock.screen_search.presentation.SearchScreen
import com.example.googlemock.ui.theme.CardButton
import kotlinx.coroutines.CoroutineScope

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SetupNavGraph(
    navController: NavHostController
) {

    val modalBottomSheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()

    NavHost(
        navController = navController,
        startDestination = Screen.Discover.route
    ) {
        composable(route = Screen.Discover.route) {
            ModalBottomSheetLayout(
                sheetContent = {
                    PreferenceMenu()
                },
                sheetState = modalBottomSheetState,
                sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
                sheetBackgroundColor = CardButton,
                sheetElevation = 10.dp
            ) {
                Scaffold(
                ) {
                    DiscoverScreen(
                        navController = navController,
                        scope = scope,
                        state = modalBottomSheetState
                    )
                }
            }
        }
        composable(route = Screen.Search.route) { SearchScreen(navController) }
        composable(route = Screen.Collections.route) { CollectionsScreen(navController) }
    }
}