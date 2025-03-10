package com.devseok.stockproject.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object StockApiModule {

    private val stockServerAddr: String
        get() = "https://api.polygon.io/"

    @Singleton
    @Provides
    @Named("stock")
    fun provideStockRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(stockServerAddr)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()

}