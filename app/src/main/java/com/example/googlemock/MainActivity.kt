package com.example.googlemock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import com.example.googlemock.common.presentation.MainScreen
import com.example.googlemock.ui.theme.GoogleMockTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GoogleMockTheme {
                MainScreen()
            }
        }
    }
}