package com.example.googlemock.screen_discover.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import com.example.googlemock.ui.theme.CardButton

@Composable
fun ProfileMenu() {
    val openMenu = remember { mutableStateOf(true) }

    /*Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                openMenu.value = !openMenu.value
            }
        ) {
            Text(text = "Where I need to put as the PFP")
        }
    }*/

    Box {
        if (openMenu.value) {
            Popup(
                alignment = Alignment.Center,
                properties = PopupProperties()
            ) {
                Box(
                    modifier = Modifier
                        .height(500.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                        .background(CardButton, RoundedCornerShape(10.dp))
                ) {
                    Column(
                        modifier = Modifier.padding(horizontal = 10.dp)
                    ) {

                    }
                }
            }
        }
    }

}



@Preview
@Composable
fun ProfileMenuPreview() {
    ProfileMenu()
}