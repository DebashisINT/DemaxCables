package com.breezefielddemax.features.viewAllOrder.model

import com.breezefielddemax.app.domain.NewOrderColorEntity
import com.breezefielddemax.app.domain.NewOrderGenderEntity
import com.breezefielddemax.app.domain.NewOrderProductEntity
import com.breezefielddemax.app.domain.NewOrderSizeEntity
import com.breezefielddemax.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

