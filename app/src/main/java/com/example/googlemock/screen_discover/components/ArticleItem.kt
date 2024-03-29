package com.example.googlemock.screen_discover.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
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
import com.example.googlemock.screen_discover.model.Article
import com.example.googlemock.R
import com.example.googlemock.ui.theme.Accent
import com.example.googlemock.ui.theme.myFontFamily
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ArticleItem(
    article: Article,
    scope: CoroutineScope,
    state: ModalBottomSheetState
) {

    var favorite by remember { mutableStateOf(article.liked) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(14.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Image(
            painterResource(article.image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(235.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Text(
            text = article.title,
            color = Color.White,
            fontSize = 21.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = myFontFamily,
            modifier = Modifier.padding(bottom = 10.dp, top = 10.dp)
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(modifier = Modifier) {
                Image(
                    painterResource(article.logo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(16.dp)
                        .height(16.dp)
                        .clip(RoundedCornerShape(10.dp)),
                )
                Text(
                    text = article.source,
                    color = Accent,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(start = 5.dp)
                )
                Text(
                    text = "•  ${article.date}",
                    color = Accent,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
            Row(modifier = Modifier) {
                IconButton(
                    onClick = { favorite = !favorite },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .size(19.dp)
                ) {
                    Icon(
                        painterResource(
                            id = if (favorite) {
                                R.drawable.dsc_fav_filled
                            } else {
                                R.drawable.dsc_favorite
                            }
                        ),
                        contentDescription = "Favorite Button",
                        tint = Accent
                    )
                }
                Icon(
                    painterResource(id = R.drawable.dsc_share),
                    contentDescription = "Mock Share Button",
                    tint = Accent,
                    modifier = Modifier
                        .padding(start = 25.dp)
                        .size(19.dp)
                )
                IconButton(
                    onClick = {
                    scope.launch {
                        state.show()
                        }
                    },
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .size(19.dp)
                ) {
                    Icon(
                        painterResource(id = R.drawable.dsc_more),
                        contentDescription = "More Menu for Preferences",
                        tint = Accent
                    )
                }
            }
        }
        Divider(color = Color.DarkGray, thickness = 1.dp)
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun ArticleItemPreview() {
    val modalBottomSheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()
    ArticleItem(
        article = Article(R.drawable.prv_test_logo,
            R.drawable.prv_test_wide,
            "Strawhat Pirates find the One Piece!",
            "ComicCon", "7h"),
        scope = scope,
        state = modalBottomSheetState
    )
}