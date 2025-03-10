package com.devseok.stockproject.data

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface StockModule {

    @Binds
    fun bindRepository(stock)
}