package com.breezefielddemax.features.login.model.productlistmodel

import com.breezefielddemax.app.domain.ModelEntity
import com.breezefielddemax.app.domain.ProductListEntity
import com.breezefielddemax.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}