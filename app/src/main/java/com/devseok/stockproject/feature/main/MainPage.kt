package com.devseok.stockproject.feature.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraph
import androidx.navigation.compose.rememberNavController
import com.devseok.stockproject.R
import com.devseok.stockproject.navigation.NavGraph

@Composable
fun MainPage(
    viewModel: MainPageBaseVM = hiltViewModel<MainPageVM>()
) {

    val navController = rememberNavController()
    val scope = rememberCoroutineScope()

    LaunchedEffect(key1 = Unit) {

    }

    Scaffold(
        modifier = Modifier
            .background(colorResource(R.color.white))
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .background(colorResource(R.color.white))
                .fillMaxSize()
                .padding(it)
        ) {
            NavGraph(navHostController = navController)
        }
    }

}