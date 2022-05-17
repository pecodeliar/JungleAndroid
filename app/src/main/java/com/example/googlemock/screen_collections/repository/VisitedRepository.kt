package com.example.googlemock.screen_collections.repository

import com.example.googlemock.R
import com.example.googlemock.screen_collections.model.Visited

class VisitedRepository {
    fun getVisitedData() : List<Visited> {
        return  listOf(
            Visited(
                logo = R.drawable.sololearn_logo,
                name = "Sololearn"
            ),
            Visited(
                logo = R.drawable.github_logo,
                name = "Github"
            )
        )
    }
}