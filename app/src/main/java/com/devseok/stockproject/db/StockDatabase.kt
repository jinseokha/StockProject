package com.devseok.stockproject.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.devseok.stockproject.db.convert.StockConverters
import com.devseok.stockproject.db.model.StockDBData
import com.devseok.stockproject.db.repository.StockDBRepository

/**
 * @author Ha Jin Seok
 * @created 2025-03-18
 * @desc
 */

@Database(entities = [StockDBData::class], version = 1, exportSchema = false)
@TypeConverters(StockConverters::class)
abstract class StockDatabase: RoomDatabase() {
    abstract fun stockRepository(): StockDBRepository

    companion object {
        private var instance: StockDatabase? = null

        @Synchronized
        fun getInstance(context: Context): StockDatabase? {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    StockDatabase::class.java,
                    "db-stock"
                )
                    .allowMainThreadQueries()
                    .build()
            }

            return instance
        }
    }

}