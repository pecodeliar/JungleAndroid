package com.example.googlemock.screen_collections.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlemock.screen_collections.model.Suggestion
import com.example.googlemock.ui.theme.Accent
import com.example.googlemock.ui.theme.CardButton

@Composable
fun SearchSuggestion(search: Suggestion) {
    Surface(
        shape = CircleShape,
        modifier = Modifier
            .clip(RoundedCornerShape(45.dp))
            .height(50.dp),
        border = BorderStroke(1.dp, Accent),
        color = Color.Transparent
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(5.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Accent,
                modifier = Modifier
                    .alpha(ContentAlpha.medium)
                    .padding(start = 10.dp)
            )
            Text(
                text = search.search,
                color = Accent,
                modifier = Modifier.padding(10.dp),
                fontSize = 16.sp
            )
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.size(50.dp).padding(end = 10.dp),
                contentPadding = PaddingValues(0.dp),
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(backgroundColor = CardButton)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Search Icon",
                    tint = Accent,
                    modifier = Modifier.alpha(ContentAlpha.medium)
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