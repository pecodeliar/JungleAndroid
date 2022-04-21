package com.example.googlemock.screen_search.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SearchSearchBar(
    text: String,
    onTextChange: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.DarkGray,
            ),
            value = text,
            onValueChange = {
                onTextChange(it)
            },
            placeholder = {
                Text(
                    modifier = Modifier.alpha(ContentAlpha.medium),
                    text = "Search...",
                    color = Color.Gray
                )
            },
            textStyle = TextStyle(
                fontSize = MaterialTheme.typography.subtitle1.fontSize
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Logo",
                    tint = Color.Red,
                )
            },
            trailingIcon = {
                Row(modifier = Modifier) {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "Phone Icon",
                        tint = com.example.googlemock.ui.theme.TextButton,
                        modifier = Modifier.padding(
                            end = 12.dp
                        )
                    )
                }
            }
        )
    }
}




@Preview
@Composable
fun SSBarPreview() {
    SearchSearchBar(text = "", onTextChange = {})
}