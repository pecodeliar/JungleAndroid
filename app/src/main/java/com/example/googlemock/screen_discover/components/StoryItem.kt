package com.example.googlemock.screen_discover.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlemock.R
import com.example.googlemock.screen_discover.model.Story
import com.example.googlemock.ui.theme.Accent

@Composable
fun StoryItem(story: Story) {
    Card(
        modifier = Modifier
            .clip(RoundedCornerShape(15.dp)),
        backgroundColor = Color.Transparent
    ) {
        Box(modifier = Modifier
            .height(350.dp)
            .width(250.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(15.dp))
        ) {
            Image(
                painter = painterResource(id = story.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        )
                    )
                )
            ) {

            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(17.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painterResource(story.logo),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                            .clip(RoundedCornerShape(10.dp))
                    )
                    Column(modifier = Modifier) {
                        Text(
                            text = story.title,
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier.padding(bottom = 12.dp)
                        )
                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = story.source,
                                color = Color.White,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.padding(bottom = 10.dp)
                            )
                            Icon(
                                painterResource(id = R.drawable.dsc_more),
                                contentDescription = "Mock More Menu Button",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(start = 20.dp)
                                    .size(28.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun StoryItemPreview() {
    StoryItem(story = Story(
        R.drawable.prv_test_logo,
        R.drawable.prv_test_long,
        "She's the Bestest!!! Sensational Even",
        "Marvel"))
}