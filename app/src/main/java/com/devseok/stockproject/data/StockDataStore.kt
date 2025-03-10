package com.devseok.stockproject.data

import javax.inject.Inject

class StockDataStore @Inject constructor(
    private val stockService: StockService
) {

}