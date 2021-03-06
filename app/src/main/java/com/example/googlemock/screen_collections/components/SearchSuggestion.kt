package com.example.googlemock.screen_collections.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlemock.screen_collections.model.Suggestion
import com.example.googlemock.ui.theme.Accent
import com.example.googlemock.ui.theme.CardButton
import com.example.googlemock.ui.theme.myFontFamily

@Composable
fun SearchSuggestion(search: Suggestion) {
    Button(
        onClick = { /*TODO*/ },
        border = BorderStroke(1.dp, Accent),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        shape = RoundedCornerShape(50),
        modifier = Modifier.padding(5.dp),
        contentPadding = PaddingValues(6.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = Accent,
                modifier = Modifier
                    .alpha(ContentAlpha.medium)
                    .size(20.dp)
                    .padding(end = 2.dp, start = 2.dp)
            )
            Text(
                text = search.search,
                color = Color.White,
                modifier = Modifier.padding(start = 3.dp, end = 4.dp, bottom = 4.dp),
                fontSize = 13.sp,
                letterSpacing = 0.1.sp,
                fontFamily = myFontFamily,
                fontWeight = FontWeight.Light
            )
            IconButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(20.dp)
                    .fillMaxHeight()
                    .border(1.dp, Color.DarkGray, shape = CircleShape)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close Icon",
                    tint = Color.White,
                    modifier = Modifier
                        .alpha(ContentAlpha.medium)
                        .padding(5.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun SearchSuggestionPreview() {
    SearchSuggestion(search = Suggestion("how to center a div"))
}