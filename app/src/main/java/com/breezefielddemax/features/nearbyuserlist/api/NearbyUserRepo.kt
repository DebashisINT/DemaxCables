package com.breezefielddemax.features.nearbyuserlist.api

import com.breezefielddemax.app.Pref
import com.breezefielddemax.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefielddemax.features.newcollection.model.NewCollectionListResponseModel
import com.breezefielddemax.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}