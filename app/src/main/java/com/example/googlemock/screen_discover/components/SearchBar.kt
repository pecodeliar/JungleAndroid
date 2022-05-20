package com.example.googlemock.screen_discover.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.googlemock.R
import com.example.googlemock.ui.theme.Accent
import com.example.googlemock.ui.theme.Secondary

@Composable
fun DiscoverSearchBar(
    navController: NavController
) {
    Button(
        onClick = { navController.navigate(
            "search_screen") {
                popUpTo("discover_screen")
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(50.dp),
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Secondary
        ),
        border = BorderStroke(0.5.dp, Color.Black)
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    tint = Accent,
                    modifier = Modifier.alpha(ContentAlpha.medium).padding(end = 7.dp)
                )
                Text(
                    modifier = Modifier.alpha(ContentAlpha.medium),
                    text = "Search...",
                    color = Accent,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    painterResource(id = R.drawable.cmn_mic),
                    contentDescription = "Phone Icon",
                    tint = Color.Red,
                    modifier = Modifier.padding(
                        end = 12.dp
                    )
                )
                Icon(
                    painterResource(id = R.drawable.dsc_camera),
                    contentDescription = "Email Icon",
                    tint = com.example.googlemock.ui.theme.TextButton,
                    modifier = Modifier.padding(
                        start = 10.dp,
                        end = 8.dp
                    )
                )
            }
        }
    }
    /*Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .clip(RoundedCornerShape(40.dp)),
        color = Secondary
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    navController.navigate(route = Screen.Search.route)
                },
            value = text,
            onValueChange = {
                onTextChange(it)
            },
            placeholder = {
                Text(
                    modifier = Modifier.alpha(ContentAlpha.medium),
                    text = "Search...",
                    color = Accent
                )
            },
            textStyle = TextStyle(
                fontSize = MaterialTheme.typography.subtitle1.fontSize
            ),
            singleLine = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    tint = Accent,
                    modifier = Modifier.alpha(ContentAlpha.medium)
                )
            },
            trailingIcon = {
                Row(modifier = Modifier) {
                    Icon(
                        painterResource(id = R.drawable.cmn_mic),
                        contentDescription = "Phone Icon",
                        tint = Color.Red,
                        modifier = Modifier.padding(
                            end = 12.dp
                        )
                    )
                    Icon(
                        painterResource(id = R.drawable.dsc_camera),
                        contentDescription = "Email Icon",
                        tint = com.example.googlemock.ui.theme.TextButton,
                        modifier = Modifier.padding(
                            start = 12.dp,
                            end = 15.dp
                        )
                    )
                }
            }
        )
    }*/
}

@Preview
@Composable
fun SearchBarPreview() {
    DiscoverSearchBar(navController = rememberNavController())
}