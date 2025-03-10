package com.devseok.stockproject.data

import javax.inject.Inject

class StockRepository @Inject constructor(
    private val stockDataStore: StockDataStore
): StockApiRepostiory {

}