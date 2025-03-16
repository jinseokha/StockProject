package com.devseok.stockproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.devseok.stockproject.feature.home.HomePage
import com.devseok.stockproject.feature.search.SearchPage
import com.devseok.stockproject.feature.searchresult.SearchResultPage

@Composable
fun NavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Route.HomePage.routeName
    ) {
        composable(Route.HomePage.routeName) {
            HomePage(navHostController = navHostController)
        }

        composable(Route.SearchPage.routeName) {
            SearchPage(navHostController = navHostController)
        }

        composable(
            route = "${Route.SearchResultPage.routeName}/{searchText}",
            arguments = listOf(navArgument("searchText"){
                type = NavType.StringType
                defaultValue = ""
            })
        ) {
            SearchResultPage(
                navHostController = navHostController,
                searchText = it.arguments?.getString("searchText") ?: ""
            )
        }
    }
}