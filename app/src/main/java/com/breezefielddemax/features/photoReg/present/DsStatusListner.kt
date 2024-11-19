package com.breezefielddemax.features.photoReg.present

import com.breezefielddemax.app.domain.ProspectEntity
import com.breezefielddemax.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}