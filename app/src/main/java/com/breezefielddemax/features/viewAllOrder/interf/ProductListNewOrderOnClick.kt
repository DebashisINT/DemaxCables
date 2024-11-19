package com.breezefielddemax.features.viewAllOrder.interf

import com.breezefielddemax.app.domain.NewOrderGenderEntity
import com.breezefielddemax.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}