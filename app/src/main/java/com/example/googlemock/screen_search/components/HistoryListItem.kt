package com.example.googlemock.screen_search.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlemock.R
import com.example.googlemock.screen_search.model.SearchHistory

@Composable
fun HistoryListItem(history: SearchHistory) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier.padding(5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painterResource(id = R.drawable.sch_clock),
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.size(25.dp)
            )
            Text(
                text = history.search,
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier
                    .padding(start = 15.dp).width(265.dp)
            )
        }
        Icon(
            painterResource(id = R.drawable.sch_arrow),
            contentDescription = null,
            tint = Color.Gray,
            modifier = Modifier
                .size(23.dp)
                .rotate(45f)
        )
    }
}



@Preview
@Composable
fun HistoryListItemPreview() {
    HistoryListItem(history = SearchHistory("how to refer to a variable in the middle of a string in java"))
}