package com.devseok.stockproject.db.repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.devseok.stockproject.db.model.StockDBData

/**
 * @author Ha Jin Seok
 * @created 2025-03-18
 * @desc
 */
@Dao
interface StockDBRepository {
    @Query("SELECT * FROM stock_db_data")
    fun findByAll() : List<StockDBData>

    @Query("SELECT * FROM stock_db_data where searchKeyword=:keyword ")
    fun findByAlarm(keyword: String): StockDBData

    @Insert
    fun insert(vararg alarmDBArticle: StockDBData)

    @Delete
    fun delete(alarmDBArticle: StockDBData)
}