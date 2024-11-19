package com.breezefielddemax.features.viewAllOrder.interf

import com.breezefielddemax.app.domain.NewOrderGenderEntity
import com.breezefielddemax.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}