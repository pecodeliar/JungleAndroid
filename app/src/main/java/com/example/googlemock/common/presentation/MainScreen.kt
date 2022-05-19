package com.example.googlemock.common.presentation

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.googlemock.common.components.BottomBar
import com.example.googlemock.common.graph.SetupNavGraph

@Composable
fun MainScreen(
) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBar(navController = navController)}
    ) {
        SetupNavGraph(navController = navController)
    }
}