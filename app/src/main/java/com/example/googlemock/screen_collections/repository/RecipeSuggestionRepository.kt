package com.example.googlemock.screen_collections.repository

import com.example.googlemock.screen_collections.model.Suggestion

class RecipeSuggestionRepository {
    fun getRecipesSuggestionData() : List<Suggestion> {
        return listOf(
            Suggestion(
                search = "chicken recipes"
            ),
            Suggestion(
                search = "instant pot recipes"
            ),
            Suggestion(
                search = "pork chop recipes"
            ),
            Suggestion(
                search = "ground beef recipes"
            ),
            Suggestion(
                search = "vegetarian recipes"
            ),
            Suggestion(
                search = "vegan recipes"
            ),
            Suggestion(
                search = "hamburger recipes"
            ),
            Suggestion(
                search = "smoothie recipes"
            ),
            Suggestion(
                search = "dessert recipes"
            ),
            Suggestion(
                search = "cupcake recipes"
            )
        )
    }
}