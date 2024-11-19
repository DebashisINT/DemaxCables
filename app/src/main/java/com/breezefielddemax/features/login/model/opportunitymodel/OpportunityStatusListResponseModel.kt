package com.breezefielddemax.features.login.model.opportunitymodel

import com.breezefielddemax.app.domain.OpportunityStatusEntity
import com.breezefielddemax.app.domain.ProductListEntity
import com.breezefielddemax.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}