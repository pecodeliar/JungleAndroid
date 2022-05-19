package com.example.googlemock.screen_collections.repository

import com.example.googlemock.screen_collections.model.Suggestion

class BookSuggestionRepository {
    fun getBookSuggestionData() : List<Suggestion> {
        return listOf(
            Suggestion(
                search = "what to read"
            ),
            Suggestion(
                search = "children's books"
            ),
            Suggestion(
                search = "historical fiction books"
            ),
            Suggestion(
                search = "science fiction books"
            ),
            Suggestion(
                search = "classic books"
            ),
            Suggestion(
                search = "best graphic novels"
            ),
            Suggestion(
                search = "mystery books"
            ),
            Suggestion(
                search = "romantic books"
            ),
            Suggestion(
                search = "dystopian novels"
            ),
            Suggestion(
                search = "fantasy books"
            )
        )
    }
}