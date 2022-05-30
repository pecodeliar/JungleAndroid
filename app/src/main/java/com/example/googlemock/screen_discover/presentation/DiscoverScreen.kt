package com.example.googlemock.screen_discover.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.googlemock.R
import com.example.googlemock.screen_discover.components.ArticleItem
import com.example.googlemock.screen_discover.components.DiscoverSearchBar
import com.example.googlemock.common.PFPMenu
import com.example.googlemock.screen_discover.components.StoryItem
import com.example.googlemock.screen_discover.data.ArticleData
import com.example.googlemock.screen_discover.data.StoryData
import com.example.googlemock.ui.theme.CardButton
import com.example.googlemock.ui.theme.Primary
import kotlinx.coroutines.CoroutineScope

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DiscoverScreen(
    navController: NavHostController,
    scope: CoroutineScope,
    state: ModalBottomSheetState
) {

    val articles = remember { ArticleData.articleList.shuffled() }
    val articles2 = remember { ArticleData.articleList.shuffled() }
    val stories = remember { StoryData.storiesList }

    val openMenu = remember { mutableStateOf(false) }

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
                        contentDescription = "Profile Picture Menu",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(34.dp)
                            .height(34.dp)
                            .clip(RoundedCornerShape(40.dp))
                            .clickable {
                                openMenu.value = !openMenu.value
                            }
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
            if (openMenu.value) {
                item {
                    Popup(
                        onDismissRequest = { openMenu.value = !openMenu.value }
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 60.dp, start = 20.dp, end = 20.dp)
                                .background(CardButton, RoundedCornerShape(10.dp))
                        ) {
                            Column(
                                modifier = Modifier
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(40.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    IconButton(
                                        onClick = { openMenu.value = !openMenu.value },
                                        modifier = Modifier
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Close,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier.alpha(ContentAlpha.medium)
                                        )
                                    }
                                    Spacer(Modifier.width(60.dp))
                                    Image(
                                        painterResource(id = R.drawable.junglebetter),
                                        contentDescription = "Logo",
                                        modifier = Modifier
                                            .width(150.dp)
                                            .fillMaxHeight()
                                            .padding(vertical = 7.dp)
                                    )
                                }
                                PFPMenu()
                            }
                        }
                    }
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
                items = articles2,
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