package com.example.googlemock.screen_discover.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.googlemock.R
import com.example.googlemock.screen_discover.components.ArticleItem
import com.example.googlemock.screen_discover.components.DiscoverSearchBar
import com.example.googlemock.screen_discover.components.StoryItem
import com.example.googlemock.screen_discover.data.ArticleData
import com.example.googlemock.screen_discover.data.StoryData
import com.example.googlemock.screen_discover.model.Article
import com.example.googlemock.screen_discover.repository.ArticleRepository
import com.example.googlemock.ui.theme.Primary
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.CoroutineScope

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DiscoverScreen(
    navController: NavHostController,
    scope: CoroutineScope,
    state: ModalBottomSheetState
) {

    val articles = remember { ArticleData.articleList.shuffled() }
    val stories = remember { StoryData.storiesList }

    val systemUiController = rememberSystemUiController()

    SideEffect {

        systemUiController.setStatusBarColor(
            color = Primary
        )

        systemUiController.setNavigationBarColor(
            color = Color.Black
        )
    }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Primary
    ) {
        LazyColumn {
            item {
                Row( //This is for the profile picture
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, end = 15.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Image(
                        painterResource(id = R.drawable.vixen),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(34.dp)
                            .height(34.dp)
                            .clip(RoundedCornerShape(40.dp))
                    )
                }
            }
            item {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(bottom = 5.dp)
                ) {
                    Image(
                        painterResource(id = R.drawable.junglebetter),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .width(150.dp)
                            .height(100.dp)
                            .padding(top = 5.dp, bottom = 15.dp)
                    )
                    DiscoverSearchBar(navController)
                }
            }
            items(2) {
                    index -> ArticleItem(article = articles[index], scope, state)
            }
            item {
                Text(
                    text = "Stories",
                    color = Color.White,
                    fontSize = 23.sp,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.padding(15.dp)
                )
                LazyRow(contentPadding = PaddingValues(start = 5.dp)) {
                    items(
                        items = stories,
                        itemContent = {
                            StoryItem(story = it)
                        }
                    )
                }
            }
            items(
                items = articles,
                itemContent = {
                    ArticleItem(article = it, scope, state)
                }
            )
            //This is to make sure that the content isn't hidden by the bottom navbar
            item {
                Row(
                    modifier = Modifier.padding(bottom = 50.dp)
                ) {

                }
            }
        }
        /* Column(
            modifier = Modifier
                .fillMaxSize(),
        ) {
            Row( //This is for the profile picture
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painterResource(id = R.drawable.vixen),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(34.dp)
                        .height(34.dp)
                        .clip(RoundedCornerShape(40.dp))
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(bottom = 5.dp)
            ) {
                Image(
                    painterResource(id = R.drawable.junglebetter),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(200.dp)
                        .height(95.dp)
                        .padding(top = 5.dp, bottom = 25.dp)
                )
                DiscoverSearchBar(
                    text = "",
                    onTextChange = {},
                    navController = rememberNavController()
                )
            }
            LazyColumn() {
                items(2) {
                        index -> ArticleItem(article = articles[index])
                }
                item {
                    Text(
                        text = "Stories",
                        color = Color.White,
                        fontSize = 23.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(15.dp)
                    )
                    LazyRow(contentPadding = PaddingValues(start = 5.dp)) {
                        items(
                            items = stories,
                            itemContent = {
                                StoryItem(story = it)
                            }
                        )
                    }
                }
                items(
                    items = articles,
                    itemContent = {
                        ArticleItem(article = it)
                    }
                )
            }
        }*/
    }
}



@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun DiscoverScreenPreview() {
    val modalBottomSheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()
    DiscoverScreen(navController = rememberNavController(), state = modalBottomSheetState, scope = scope)
}