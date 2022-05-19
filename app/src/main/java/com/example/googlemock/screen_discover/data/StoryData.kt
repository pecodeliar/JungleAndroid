package com.example.googlemock.screen_discover.data

import com.example.googlemock.R
import com.example.googlemock.screen_discover.model.Story

object StoryData {
    val storiesList = listOf(
        Story(
            logo = R.drawable.cafelogo,
            image = R.drawable.pandabetter,
            title = "Panda Promoted to Full-Time at Zoo!",
            source = "Polar Press"
        ),
        Story(
            logo = R.drawable.sonic,
            image = R.drawable.knunckles,
            title = "Knuckles on Pranked!",
            source = "Ring Report"
        ),
        Story(
            logo = R.drawable.manhattan,
            image = R.drawable.topcat,
            title = "Top Cat Arrested on Robbery Charges",
            source = "Manhattan Times"
        ),
        Story(
            logo = R.drawable.picnicbasket,
            image = R.drawable.yogibetter,
            title = "Yogi Bear Donates to Food Shelters",
            source = "Jellystone Jargon"
        ),
        Story(
            logo = R.drawable.looney,
            image = R.drawable.bugsbetter,
            title = "Bug Bunny Passes Bar Exam!",
            source = "Looney's Latest"
        )
    )
}