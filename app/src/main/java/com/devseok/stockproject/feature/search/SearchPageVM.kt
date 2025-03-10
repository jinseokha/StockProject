package com.devseok.stockproject.feature.search

import androidx.lifecycle.ViewModel
import com.devseok.stockproject.data.StockRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchPageVM @Inject constructor(
    private val repository: StockRepository
): ViewModel(), SearchPageBaseVM{

}