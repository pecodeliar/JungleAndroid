package com.example.googlemock.screen_collections.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.googlemock.R
import com.example.googlemock.screen_discover.components.DiscoverSearchBar
import com.example.googlemock.ui.theme.Primary

@Composable
fun DiscoverScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        color = Primary
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painterResource(id = R.drawable.vixen),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                        .clip(RoundedCornerShape(40.dp))
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.junglebetter),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(200.dp).height(95.dp)
                        .padding(top = 25.dp, bottom = 25.dp)
                )
                DiscoverSearchBar(text = "", onTextChange = {})
            }
        }
    }
}



@Preview
@Composable
fun DiscoverScreenPreview() {
    DiscoverScreen()
}