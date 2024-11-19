package com.breezefielddemax.features.dashboard.presentation.api.dayStartEnd

import com.breezefielddemax.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefielddemax.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}