package com.example.googlemock.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavGraph
import androidx.navigation.compose.rememberNavController
import com.example.googlemock.screen_discover.presentation.DiscoverScreen
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = Primary,
    primaryVariant = Secondary,
    secondary = CardButton
)

private val LightColorPalette = lightColors(
    primary = Primary,
    primaryVariant = Secondary,
    secondary = CardButton

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)



@Composable
fun GoogleMockTheme(darkTheme: Boolean = true, content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )

    // Remember a SystemUiController
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = MaterialTheme.colors.isLight

    SideEffect {

            systemUiController.setStatusBarColor(
                color = Primary
            )

            systemUiController.setNavigationBarColor(
                color = Color.Black
            )
    }
}