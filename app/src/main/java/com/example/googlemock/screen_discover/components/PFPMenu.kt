package com.example.googlemock.screen_discover.components

import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
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

    var moreAccounts by remember { mutableStateOf(false) }

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
                        contentDescription = null,
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
                            fontFamily = myFontFamily,
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
                        onClick = { moreAccounts = !moreAccounts },
                        modifier = Modifier
                            .size(20.dp)
                            .fillMaxHeight()
                            .border(1.dp, Accent, shape = CircleShape)
                    ) {
                        if (moreAccounts) {
                            Icon(
                                painterResource(id = R.drawable.dsc_arrow),
                                contentDescription = "More Accounts Button",
                                tint = Color.White,
                                modifier = Modifier
                                    .rotate(270f)
                                    .padding(3.dp)
                            )
                        } else {
                            Icon(
                                painterResource(id = R.drawable.dsc_arrow),
                                contentDescription = "More Accounts Button",
                                tint = Color.White,
                                modifier = Modifier
                                    .rotate(90f)
                                    .padding(3.dp)
                            )
                        }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp),
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
            if (moreAccounts) {
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp, modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 60.dp)
                )
                Row(
                    modifier = Modifier.padding(vertical = 5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painterResource(id = R.drawable.dsc_without),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 18.dp)
                    )
                    Text(
                        text = "Use without an account",
                        fontFamily = myFontFamily,
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
                        painterResource(id = R.drawable.dsc_add_acc),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 18.dp)
                    )
                    Text(
                        text = "Add another account",
                        color = Color.White,
                        fontFamily = myFontFamily,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Row(
                    modifier = Modifier.padding(vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painterResource(id = R.drawable.dsc_mng_acc),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 18.dp)
                    )
                    Text(
                        text = "Manage accounts on this device",
                        color = Color.White,
                        fontFamily = myFontFamily,
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
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
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier
                            .padding(horizontal = 18.dp)
                    )
                    Text(
                        text = "Search history",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontFamily = myFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.padding(horizontal = 40.dp))
                Text(
                    text = "Saving",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontFamily = myFontFamily,
                    modifier = Modifier.padding(end = 10.dp),
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.padding(horizontal = 30.dp))
                Column(
                    modifier = Modifier
                ) {
                    Divider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
                    Text(
                        text = "Delete last 15 minutes",
                        color = Color.White,
                        fontSize = 15.sp,
                        fontFamily = myFontFamily,
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
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Recent",
                    color = Color.White,
                    fontFamily = myFontFamily,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                modifier = Modifier.padding(vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource(id = R.drawable.dsc_reminders),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Reminders",
                    color = Color.White,
                    fontFamily = myFontFamily,
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
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Your data in Search",
                    color = Color.White,
                    fontFamily = myFontFamily,
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
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Settings",
                    color = Color.White,
                    fontFamily = myFontFamily,
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
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .padding(horizontal = 18.dp)
                )
                Text(
                    text = "Help & feedback",
                    color = Color.White,
                    fontFamily = myFontFamily,
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




@Preview
@Composable
fun PFPMenuPreview() {
    PFPMenu()
}