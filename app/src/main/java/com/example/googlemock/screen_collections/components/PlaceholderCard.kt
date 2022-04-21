package com.example.googlemock.screen_collections.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlemock.R
import com.example.googlemock.screen_collections.model.Placeholder
import com.example.googlemock.ui.theme.Accent

//The card that shows when there hasn't been anything saved
@Composable
fun PlaceholderCard(placeholder: Placeholder) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp)),
        backgroundColor = placeholder.background
    ) {
        Row(modifier = Modifier) {
            Column(modifier = Modifier) {
                Icon(
                    painterResource(id = R.drawable.col_twinkle),
                    contentDescription = "Twinkle Stars",
                    tint = Accent,
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .size(40.dp)
                )
                Text(
                    text = "Save ${placeholder.category} and find inspiration on what to ${placeholder.verb} next",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Go to ${placeholder.button}")
                }
            }
            Image(
                painterResource(placeholder.graphic),
                contentDescription = "Graphic")
        }
    }
}