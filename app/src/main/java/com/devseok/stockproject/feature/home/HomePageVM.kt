package com.devseok.stockproject.feature.home

import androidx.lifecycle.ViewModel
import com.devseok.stockproject.data.StockRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomePageVM @Inject constructor(
    private val repository: StockRepository
): ViewModel(), HomePageBaseVM {

}