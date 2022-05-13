package com.example.googlemock.screen_collections.repository

import com.example.googlemock.screen_collections.model.Suggestion

class ShowSuggestionRepository {
    fun getShowSuggestionData() : List<Suggestion> {
        return listOf(
            Suggestion(
                search = "what to watch"
            ),
            Suggestion(
                search = "free movies"
            ),
            Suggestion(
                search = "new movies"
            ),
            Suggestion(
                search = "binge worthy shows"
            ),
            Suggestion(
                search = "comedy movies"
            ),
            Suggestion(
                search = "documentary movies"
            ),
            Suggestion(
                search = "best anime"
            ),
            Suggestion(
                search = "cartoon shows"
            ),
            Suggestion(
                search = "family movies"
            ),
            Suggestion(
                search = "crime shows"
            )
        )
    }
}