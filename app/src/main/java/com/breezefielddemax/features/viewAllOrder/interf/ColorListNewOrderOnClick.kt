package com.breezefielddemax.features.viewAllOrder.interf

import com.breezefielddemax.app.domain.NewOrderColorEntity
import com.breezefielddemax.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}