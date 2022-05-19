package com.example.googlemock.screen_collections.model

enum class Bookmark (
    val title: String,
    val text: String,
    val learn: Boolean //For showing the learn more button or not
) {
    SHOPPING(
        "Your tracked products will appear here",
        "Track products to get updates about price drops and more",
        true
    ),
    COLLECTIONS(
        "Organize your finds as you search",
        "Tap the bookmark icon to add images, pages, products and more to your collections",
        false
    )
}