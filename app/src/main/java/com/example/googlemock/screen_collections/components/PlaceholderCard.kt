package com.example.googlemock.screen_collections.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlemock.R
import com.example.googlemock.screen_collections.model.Placeholder
import com.example.googlemock.ui.theme.Accent
import com.example.googlemock.ui.theme.ShowsCard

//The card that shows when there hasn't been anything saved
@Composable
fun PlaceholderCard(placeholder: Placeholder) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(208.dp)
            .clip(RoundedCornerShape(15.dp)),
        backgroundColor = placeholder.background
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier
                .width(250.dp)
                .padding(10.dp)
                .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    painterResource(id = R.drawable.col_twinkle),
                    contentDescription = "Twinkle Stars",
                    tint = Color.White,
                    modifier = Modifier
                        .size(30.dp)
                )
                Text(
                    text = "Save ${placeholder.category} and find inspiration on what to ${placeholder.verb} next",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                    color = Color.White
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(20.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray)
                ) {
                    Text(text = "Go to ${placeholder.button}")
                }
            }
            Column(
                modifier = Modifier.fillMaxHeight(),
                horizontalAlignment = Alignment.End
            ) {
                Image(
                    painterResource(placeholder.graphic),
                    contentDescription = "Graphic",
                )
            }
        }
    }
}


@Preview
@Composable
fun PlaceholderCardPreview() {
    PlaceholderCard(placeholder = Placeholder(
        "shows and movies",
        "watch", ShowsCard,
        "watchlist",
        R.drawable.plc_movie
        )
    )
}