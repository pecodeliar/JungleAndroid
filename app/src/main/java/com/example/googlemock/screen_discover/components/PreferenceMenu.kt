package com.example.googlemock.screen_discover.components

import android.content.Context
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.googlemock.R
import com.example.googlemock.ui.theme.Accent

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun PreferenceMenu() {

    val context = LocalContext.current

    Column(
        modifier = Modifier
    ) {
        Text(
            text = "Preferences & feedback",
            color = Color.White,
            modifier = Modifier.padding(10.dp),
            fontWeight = FontWeight.Bold
        )
        Divider(color = Color.DarkGray, thickness = 1.dp)
        PreferenceMenuItem(
            context = context,
            icon = R.drawable.dsc_dislike,
            text = "Not interested in this"
        )
        PreferenceMenuItem(
            context = context,
            icon = R.drawable.dsc_dont_show,
            text = "Don't show content from this source"
        )
        PreferenceMenuItem(
            context = context,
            icon = R.drawable.dsc_manage,
            text = "Manage channels and interests"
        )
        PreferenceMenuItem(
            context = context,
            icon = R.drawable.dsc_report,
            text = "Report this"
        )
        PreferenceMenuItem(
            context = context,
            icon = R.drawable.dsc_feedback,
            text = "Send feedback"
        )
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
                    .makeText(context, "Too bad, so sad.", Toast.LENGTH_SHORT)
                    .show()
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painterResource(icon),
            contentDescription = "Icon",
            modifier = Modifier
                .padding(4.dp)
                .size(25.dp),
            tint = Accent
        )
        Spacer(modifier = Modifier.padding(horizontal = 10.dp))
        Text(
            text = text,
            color = Color.White
        )
    }
}


@Preview
@Composable
fun BottomSheetContentPreview() {
    PreferenceMenu()
}