package com.breezefielddemax.features.login.api.opportunity

import com.breezefielddemax.app.Pref
import com.breezefielddemax.app.utils.AppUtils
import com.breezefielddemax.base.BaseResponse
import com.breezefielddemax.features.addshop.model.AudioFetchDataCLass
import com.breezefielddemax.features.addshop.model.StockAllResponse
import com.breezefielddemax.features.dashboard.presentation.DashboardActivity
import com.breezefielddemax.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezefielddemax.features.login.model.productlistmodel.ProductListResponseModel
import com.breezefielddemax.features.orderITC.SyncDeleteOppt
import com.breezefielddemax.features.orderITC.SyncEditOppt
import com.breezefielddemax.features.orderITC.SyncOppt
import com.breezefielddemax.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }

    fun getAudioL(user_id: String,data_limit_in_days:String): Observable<AudioFetchDataCLass> {
        return apiService.getAudioLApi(user_id,data_limit_in_days)
    }


    fun saveLMSModuleInfo(obj: DashboardActivity.LMSModule): Observable<BaseResponse> {
        return apiService.saveLMSModuleInfoApi(obj)
    }

    fun getAllStock(user_id: String): Observable<StockAllResponse> {
        return apiService.getAllStockApi(user_id)
    }
}