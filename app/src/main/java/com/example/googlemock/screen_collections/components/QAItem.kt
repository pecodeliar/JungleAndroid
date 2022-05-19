package com.example.googlemock.screen_collections.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlemock.R
import com.example.googlemock.screen_collections.model.Visited
import com.example.googlemock.ui.theme.Container

@Composable
fun QAItem(visited: Visited) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(57.dp).padding(bottom = 7.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(50.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color.DarkGray)
        ) {
            Image(
                painter = painterResource(id = visited.logo),
                contentDescription = "Site Logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(15.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .width(200.dp)
                .padding(start = 14.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = visited.name,
                color = Color.White,
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = visited.text,
                color = Container,
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}




@Preview
@Composable
fun QAItemPreview() {
    QAItem(visited = Visited(R.drawable.prv_test_logo, "Android Developers - What are we doing?" ))
}