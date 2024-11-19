package com.breezefielddemax.features.viewAllOrder.interf

import com.breezefielddemax.app.domain.NewOrderGenderEntity
import com.breezefielddemax.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}