package com.breezefielddemax.features.stockAddCurrentStock.api

import com.breezefielddemax.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefielddemax.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}