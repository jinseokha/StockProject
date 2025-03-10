package com.devseok.stockproject.feature.searchresult

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.devseok.stockproject.feature.search.SearchPageVM

@Composable
fun SearchResultPage(
    navHostController: NavHostController,
    viewModel: SearchResultPageBaseVM = hiltViewModel<SearchResultPageVM>()
) {

}