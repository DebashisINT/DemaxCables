package com.breezefielddemax.features.viewAllOrder.orderOptimized

import com.breezefielddemax.app.domain.ProductOnlineRateTempEntity
import com.breezefielddemax.base.BaseResponse
import com.breezefielddemax.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}