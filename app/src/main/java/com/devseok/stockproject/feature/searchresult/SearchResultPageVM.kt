package com.devseok.stockproject.feature.searchresult

import androidx.lifecycle.ViewModel
import com.devseok.stockproject.data.StockRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchResultPageVM @Inject constructor(
    private val repository: StockRepository
): ViewModel(), SearchResultPageBaseVM {

}