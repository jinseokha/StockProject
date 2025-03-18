package com.devseok.stockproject.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author Ha Jin Seok
 * @created 2025-03-18
 * @desc
 */
@Entity(tableName = "stock_db_data")
data class StockDBData(
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    val searchKeyword: String
)
