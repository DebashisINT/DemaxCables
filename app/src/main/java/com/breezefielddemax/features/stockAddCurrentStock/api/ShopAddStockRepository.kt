package com.breezefielddemax.features.stockAddCurrentStock.api

import com.breezefielddemax.base.BaseResponse
import com.breezefielddemax.features.location.model.ShopRevisitStatusRequest
import com.breezefielddemax.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefielddemax.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefielddemax.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefielddemax.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}