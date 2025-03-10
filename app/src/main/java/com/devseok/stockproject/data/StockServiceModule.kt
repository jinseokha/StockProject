package com.devseok.stockproject.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object StockServiceModule {

    @Provides
    @Singleton
    fun provideStock(@Named("stock") retrofit: Retrofit): StockService =
        retrofit.create(
            StockService::class.java
        )
}