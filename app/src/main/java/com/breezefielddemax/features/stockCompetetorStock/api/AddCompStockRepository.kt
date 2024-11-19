package com.breezefielddemax.features.stockCompetetorStock.api

import com.breezefielddemax.base.BaseResponse
import com.breezefielddemax.features.orderList.model.NewOrderListResponseModel
import com.breezefielddemax.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefielddemax.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}