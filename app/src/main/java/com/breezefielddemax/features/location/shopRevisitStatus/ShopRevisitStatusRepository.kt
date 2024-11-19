package com.breezefielddemax.features.location.shopRevisitStatus

import com.breezefielddemax.base.BaseResponse
import com.breezefielddemax.features.location.model.ShopDurationRequest
import com.breezefielddemax.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}