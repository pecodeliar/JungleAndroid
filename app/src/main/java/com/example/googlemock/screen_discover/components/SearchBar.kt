package com.example.googlemock.screen_discover.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.googlemock.R
import com.example.googlemock.ui.theme.Accent
import com.example.googlemock.ui.theme.Secondary

@Composable
fun DiscoverSearchBar(
    text: String,
    onTextChange: (String) -> Unit,
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .clip(RoundedCornerShape(40.dp)),
        color = Secondary
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
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
    }
}

@Preview
@Composable
fun SearchBarPreview() {
    DiscoverSearchBar(text = "", onTextChange = {})
}