package com.example.googlemock.common.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.googlemock.common.components.BottomBar
import com.example.googlemock.common.graph.SetupNavGraph

@Composable
fun MainScreen(
) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController)},
        content = {
            Box(modifier = Modifier.padding(it)) {
                SetupNavGraph(navController = navController)
            }
        }
    )
}