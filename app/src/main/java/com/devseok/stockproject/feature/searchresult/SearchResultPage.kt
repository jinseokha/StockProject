package com.devseok.stockproject.feature.searchresult

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.devseok.stockproject.feature.search.SearchPageVM

@Composable
fun SearchResultPage(
    navHostController: NavHostController,
    searchText: String,
    viewModel: SearchResultPageBaseVM = hiltViewModel<SearchResultPageVM>()
) {
    val context = LocalContext.current

    LaunchedEffect(key1 = searchText) {
        if (searchText != "") {
            //viewModel.getCharacters(searchText = searchText)

        }
    }


}