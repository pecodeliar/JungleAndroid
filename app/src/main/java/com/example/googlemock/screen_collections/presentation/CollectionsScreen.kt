package com.example.googlemock.screen_collections.presentation

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
import com.example.googlemock.screen_collections.components.BookmarkBox
import com.example.googlemock.screen_collections.components.PlaceholderCard
import com.example.googlemock.screen_collections.components.QAItem
import com.example.googlemock.screen_collections.components.SearchSuggestion
import com.example.googlemock.screen_collections.data.*
import com.example.googlemock.screen_collections.model.Bookmark
import com.example.googlemock.screen_collections.model.Placeholder
import com.example.googlemock.ui.theme.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun CollectionsScreen(
    navController: NavHostController
) {
    
    val books = remember { BookSuggestionData.bookSearches }
    val recipes = remember { RecipeSuggestionData.recipeSuggestions }
    val shopping = remember { ShoppingSuggestionData.shopSuggestions }
    val shows = remember { ShowSuggestionData.showSuggestions }
    val visits = remember { VisitedData.visitedList }

    val systemUiController = rememberSystemUiController()
    val useDarkIcons = MaterialTheme.colors.isLight

    SideEffect {

        systemUiController.setStatusBarColor(
            color = Secondary
        )

        systemUiController.setNavigationBarColor(
            color = Color.Black
        )
    }
    
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Secondary
    ) {
        LazyColumn(
            modifier = Modifier,
        ) {
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
            //Quick Access Section
            item {
                Column(
                    modifier = Modifier.padding(7.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Quick Access",
                            color = Color.White,
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = myFontFamily,
                            modifier = Modifier.padding(15.dp)
                        )
                        Text(
                            text = "Edit",
                            color = TextButton,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = myFontFamily,
                            modifier = Modifier.padding(15.dp)
                        )
                    }
                    Column {
                        visits.forEach { visited ->
                            QAItem(visited)
                        }
                    }
                }
            }
            item {
                Column(modifier = Modifier.padding(top = 4.dp)) {
                    Divider(color = CardButton, thickness = 1.dp)
                    Divider(color = Primary, thickness = 6.dp)
                }
            }
            item {
                //Shows & Movies Section
                Column(
                    modifier = Modifier.padding(10.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Shows & movies",
                            color = Color.White,
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = myFontFamily,
                            modifier = Modifier.padding(15.dp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.col_info),
                            contentDescription = "Information Icon",
                            tint = Accent,
                            modifier = Modifier.size(17.dp)
                        )
                    }
                    PlaceholderCard(placeholder = Placeholder.SHOWS)
                    Text(
                        text = "People also search for",
                        color = Accent,
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = myFontFamily,
                        modifier = Modifier.padding(7.dp)
                    )
                    LazyRow(contentPadding = PaddingValues(top = 8.dp, bottom = 10.dp)) {
                        items(
                            items = shows,
                            itemContent = {
                                SearchSuggestion(search = it)
                            }
                        )
                    }
                }
            }
            item {
                Column(modifier = Modifier.padding(top = 4.dp)) {
                    Divider(color = CardButton, thickness = 1.dp)
                    Divider(color = Primary, thickness = 6.dp)
                }
            }
            //Shopping Section
            item {
                Column(
                    modifier = Modifier.padding(10.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Shopping",
                            color = Color.White,
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = myFontFamily,
                            modifier = Modifier.padding(15.dp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.col_info),
                            contentDescription = "Information Icon",
                            tint = Accent,
                            modifier = Modifier.size(17.dp)
                        )
                    }
                    BookmarkBox(bookmark = Bookmark.SHOPPING)
                    Text(
                        text = "People also search for",
                        color = Accent,
                        fontWeight = FontWeight.Bold,
                        fontFamily = myFontFamily,
                        modifier = Modifier.padding(7.dp)
                    )
                    LazyRow(contentPadding = PaddingValues(top = 8.dp, bottom = 10.dp)) {
                        items(
                            items = shopping,
                            itemContent = {
                                SearchSuggestion(search = it)
                            }
                        )
                    }
                }
            }
            item {
                Column(modifier = Modifier.padding(top = 4.dp)) {
                    Divider(color = CardButton, thickness = 1.dp)
                    Divider(color = Primary, thickness = 6.dp)
                }
            }
            //Recipes Section
            item {
                Column(
                    modifier = Modifier.padding(10.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Recipes",
                            color = Color.White,
                            fontSize = 23.sp,
                            fontFamily = myFontFamily,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(15.dp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.col_info),
                            contentDescription = "Information Icon",
                            tint = Accent,
                            modifier = Modifier.size(17.dp)
                        )
                    }
                    PlaceholderCard(placeholder = Placeholder.RECIPES)
                    Text(
                        text = "People also search for",
                        color = Accent,
                        fontWeight = FontWeight.Bold,
                        fontFamily = myFontFamily,
                        modifier = Modifier.padding(7.dp)
                    )
                    LazyRow(contentPadding = PaddingValues(top = 8.dp, bottom = 10.dp)) {
                        items(
                            items = recipes,
                            itemContent = {
                                SearchSuggestion(search = it)
                            }
                        )
                    }
                }
            }
            item {
                Column(modifier = Modifier.padding(top = 4.dp)) {
                    Divider(color = CardButton, thickness = 1.dp)
                    Divider(color = Primary, thickness = 6.dp)
                }
            }
            //Books Section
            item {
                Column(
                    modifier = Modifier.padding(10.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Books",
                            color = Color.White,
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = myFontFamily,
                            modifier = Modifier.padding(15.dp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.col_info),
                            contentDescription = "Information Icon",
                            tint = Accent,
                            modifier = Modifier.size(17.dp)
                        )
                    }
                    PlaceholderCard(placeholder = Placeholder.BOOKS)
                    Text(
                        text = "People also search for",
                        color = Accent,
                        fontWeight = FontWeight.Bold,
                        fontFamily = myFontFamily,
                        modifier = Modifier.padding(7.dp)
                    )
                    LazyRow(contentPadding = PaddingValues(top = 8.dp, bottom = 10.dp)) {
                        items(
                            items = books,
                            itemContent = {
                                SearchSuggestion(search = it)
                            }
                        )
                    }
                }
            }
            item {
                Column(modifier = Modifier.padding(top = 4.dp)) {
                    Divider(color = CardButton, thickness = 1.dp)
                    Divider(color = Primary, thickness = 6.dp)
                }
            }
            //Collections Section
            item {
                Column(
                    modifier = Modifier.padding(10.dp),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Collections",
                            color = Color.White,
                            fontFamily = myFontFamily,
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(15.dp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.col_info),
                            contentDescription = "Information Icon",
                            tint = Accent,
                            modifier = Modifier.size(17.dp)
                        )
                    }
                    BookmarkBox(bookmark = Bookmark.COLLECTIONS)
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.DarkGray),
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = "Create a collection",
                            fontFamily = myFontFamily,
                            modifier = Modifier.fillMaxHeight(),
                            color = Accent,
                        )
                    }
                }
            }
            item {
                Column(modifier = Modifier.padding(top = 4.dp, bottom = 45.dp)) {
                    Divider(color = CardButton, thickness = 1.dp)
                    Divider(color = Primary, thickness = 6.dp)
                }
            }
        }
    }
}

@Preview
@Composable
fun CollectionsScreenPreview() {
    CollectionsScreen(navController = rememberNavController())
}