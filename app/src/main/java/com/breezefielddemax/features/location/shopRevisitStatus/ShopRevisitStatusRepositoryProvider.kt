package com.breezefielddemax.features.location.shopRevisitStatus

import com.breezefielddemax.features.location.shopdurationapi.ShopDurationApi
import com.breezefielddemax.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}