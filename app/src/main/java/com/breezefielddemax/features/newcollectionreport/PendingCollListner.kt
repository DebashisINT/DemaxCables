package com.breezefielddemax.features.newcollectionreport

import com.breezefielddemax.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}