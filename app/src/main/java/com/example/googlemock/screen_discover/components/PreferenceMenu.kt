package com.example.googlemock.screen_discover.components

import android.content.Context
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.googlemock.R
import com.example.googlemock.ui.theme.CardButton

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PreferenceMenu() {

    val state = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()

    val context = LocalContext.current


    ModalBottomSheetLayout(
        sheetBackgroundColor = CardButton,
        sheetElevation = 5.dp,
        sheetShape = RoundedCornerShape(topStart = 30.dp),
        sheetState = state,

        sheetContent = {
            Surface(
                color = CardButton
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    contentAlignment = Alignment.CenterEnd
                ) {
                    Text(
                        text = "Preferences & feedback",
                        color = Color.White,
                        modifier = Modifier.padding(10.dp)
                    )
                }
                Divider(color = Color.DarkGray, thickness = 1.dp)

            }
        }
    ) {

    }

}

@Composable
fun PreferenceMenuItem(
    context: Context,
    @DrawableRes icon: Int,
    text: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {
                Toast
                    .makeText(context, text, Toast.LENGTH_SHORT)
                    .show()
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painterResource(icon),
            contentDescription = "Icon",
            modifier = Modifier
                .padding(4.dp)
                .size(25.dp)
        )
        Spacer(modifier = Modifier.padding(horizontal = 10.dp))
        Text(
            text = text
        )
    }
}