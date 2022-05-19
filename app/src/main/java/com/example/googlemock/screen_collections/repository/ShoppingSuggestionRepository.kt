package com.example.googlemock.screen_collections.repository

import com.example.googlemock.screen_collections.model.Suggestion

class ShoppingSuggestionRepository {
    fun getShoppingSuggestionData() : List<Suggestion> {
        return listOf(
            Suggestion(
                search = "best watch"
            ),
            Suggestion(
                search = "best laptop"
            ),
            Suggestion(
                search = "best camera"
            ),
            Suggestion(
                search = "best air fryer"
            ),
            Suggestion(
                search = "best mattress"
            ),
            Suggestion(
                search = "best treadmill"
            ),
            Suggestion(
                search = "best board game"
            ),
            Suggestion(
                search = "best backpack"
            ),
            Suggestion(
                search = "best tv"
            ),
            Suggestion(
                search = "best chair"
            )
        )
    }
}