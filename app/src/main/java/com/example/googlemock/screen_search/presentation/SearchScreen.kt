package com.example.googlemock.screen_search.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.googlemock.screen_search.components.HistoryListItem
import com.example.googlemock.screen_search.components.SearchSearchBar
import com.example.googlemock.screen_search.data.SearchHistoryData
import com.example.googlemock.ui.theme.Secondary
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun SearchScreen(
    navController: NavHostController
) {

    val textState = remember { mutableStateOf(TextFieldValue("")) }
    val history = remember { SearchHistoryData.historyList.shuffled() }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Secondary
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            SearchSearchBar()
            LazyColumn {
                items(
                    items = history,
                    itemContent = {
                        HistoryListItem(history = it)
                    }
                )
            }
        }
    }
}


@Preview
@Composable
fun SearchScreenPreview() {
    SearchScreen(navController = rememberNavController())
}