package com.devseok.stockproject.feature.home

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun HomePage(
    navHostController: NavHostController,
    viewModel: HomePageBaseVM = hiltViewModel<HomePageVM>()
) {

}