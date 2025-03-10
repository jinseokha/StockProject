package com.devseok.stockproject.navigation


sealed class Route(
    val routeName: String
) {
    object HomePage: Route(routeName = "home_page")

    object SearchPage: Route(routeName = "search_page")

    object SearchResultPage: Route(routeName = "search_result_page")
}