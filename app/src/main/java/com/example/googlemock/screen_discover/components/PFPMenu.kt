package com.example.googlemock.screen_discover.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googlemock.R
import com.example.googlemock.ui.theme.Accent
import com.example.googlemock.ui.theme.CardButton
import com.example.googlemock.ui.theme.myFontFamily

@Composable
fun PFPMenu() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
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
                    onClick = {
                    /*TODO*/
                    },
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
            //Accounts Section
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 13.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 10.dp)
                ) {
                    Image(
                        painterResource(id = R.drawable.vixen),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .width(38.dp)
                            .height(38.dp)
                            .clip(RoundedCornerShape(40.dp))
                    )
                    Column(
                        modifier = Modifier.padding(horizontal = 10.dp)
                    ) {
                        Text(
                            text = "Mari McCabe",
                            color = Color.White,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "mccabe.mari@jmail.com",
                            color = Accent,
                            fontSize = 10.sp
                        )
                    }
                }
                Row(
                    modifier = Modifier.padding(end = 10.dp)
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(20.dp)
                            .fillMaxHeight()
                            .border(1.dp, Accent, shape = CircleShape)
                    ) {
                        Icon(
                            painterResource(id = R.drawable.dsc_arrow),
                            contentDescription = "More Accounts Button",
                            tint = Color.White,
                            modifier = Modifier
                                .rotate(270f)
                                .padding(3.dp)
                        )
                    }
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .border(1.dp, Color.Gray, shape = CircleShape),
                    colors = ButtonDefaults.buttonColors(backgroundColor = CardButton)
                ) {
                    Text(
                        text = "Manage your Jungle Account",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontFamily = myFontFamily,
                        letterSpacing = 0.5.sp
                    )
                }
            }
            //End of Accounts Section
            Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
            //History Section
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.padding(vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painterResource(id = R.drawable.dsc_history),
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 18.dp)
                    )
                    Text(
                        text = "Search history",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.padding(horizontal = 40.dp))
                Text(
                    text = "Saving",
                    color = Color.White,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(end = 10.dp),
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.padding(horizontal = 28.dp))
                Column(
                    modifier = Modifier
                ) {
                    Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
                    Text(
                        text = "Delete last 15 minutes",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                }
            }
            //End of History Section
            Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 10.dp)
            ) {
                Icon(
                    painterResource(id = R.drawable.dsc_recent),
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Recent",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                modifier = Modifier.padding(vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource(id = R.drawable.dsc_favorite),
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Reminders",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
            Row(
                modifier = Modifier.padding(vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource(id = R.drawable.dsc_data),
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Your data in Search",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                modifier = Modifier.padding(vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource(id = R.drawable.dsc_settings),
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Settings",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                modifier = Modifier.padding(vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource(id = R.drawable.dsc_help),
                    contentDescription = "",
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Help & feedback",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                TextButton(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Privacy Policy",
                        fontSize = 12.sp,
                        color = Color.White
                    )
                }
                Text(
                    text = " • ",
                    fontSize = 12.sp,
                    color = Color.White
                )
                TextButton(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Terms of Service",
                        fontSize = 12.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}




@Preview
@Composable
fun PFPMenuPreview() {
    PFPMenu()
}