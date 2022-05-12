package com.example.googlemock.screen_collections.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
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
import com.example.googlemock.screen_collections.model.Bookmark
import com.example.googlemock.ui.theme.Accent
import com.example.googlemock.ui.theme.Container
import com.example.googlemock.ui.theme.Secondary
import com.example.googlemock.ui.theme.TextButton

//The card that shows when there hasn't been anything they have tracked to that particular section
@Composable
fun BookmarkBox(bookmark: Bookmark) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(115.dp)
            .clip(RoundedCornerShape(25.dp))
            .padding(10.dp),
        backgroundColor = Color.DarkGray
    ) {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(75.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Canvas( //https://agarasul.medium.com/shapes-in-jetpack-compose-de740f5507f2
                        modifier = Modifier
                            .size(50.dp)
                            .padding(top = 20.dp),
                        onDraw = {
                            val size = 50.dp.toPx()
                            drawCircle(
                                color = Accent,
                                radius = size / 2f
                            )
                        }
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(75.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {
                    Icon(
                        painterResource(id = R.drawable.col_nav),
                        contentDescription = "Bookmark",
                        tint = TextButton,
                        modifier = Modifier
                            .padding(top = 28.dp)
                            .size(15.dp)
                    )
                }
            }
            Column(
                modifier = Modifier.padding(bottom = 15.dp).fillMaxHeight(),
            ) {
                Text(
                    text = bookmark.title,
                    color = Accent,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 10.dp, end = 20.dp)
                )
                Text(
                    text = bookmark.text,
                    color = Color.Gray,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(top = 3.dp, end = 20.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun BookmarkBoxPreview() {
    BookmarkBox(
        bookmark = Bookmark(
            "Your Mom",
            "The birds are spies that are a part of the bourgeoisie.",
            false
        )
    )
}