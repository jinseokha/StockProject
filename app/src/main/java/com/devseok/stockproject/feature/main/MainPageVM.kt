package com.devseok.stockproject.feature.main

import androidx.lifecycle.ViewModel
import com.devseok.stockproject.data.StockRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainPageVM @Inject constructor(
    private val repository: StockRepository
): ViewModel(), MainPageBaseVM {

}