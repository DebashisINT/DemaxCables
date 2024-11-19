package com.breezefielddemax.features.viewAllOrder.interf

import com.breezefielddemax.app.domain.NewOrderProductEntity
import com.breezefielddemax.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}