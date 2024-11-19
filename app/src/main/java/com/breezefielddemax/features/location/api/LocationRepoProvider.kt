package com.breezefielddemax.features.location.api

import com.breezefielddemax.features.location.shopdurationapi.ShopDurationApi
import com.breezefielddemax.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}