package com.breezefielddemax.features.newcollection.model

import com.breezefielddemax.app.domain.CollectionDetailsEntity
import com.breezefielddemax.base.BaseResponse
import com.breezefielddemax.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}