package com.breezefielddemax.features.menuBeat

import com.breezefielddemax.features.addshop.model.AddShopRequestData
import com.breezefielddemax.features.addshop.model.AddShopResponse
import io.reactivex.Observable

/**
 * Created by Pratishruti on 22-11-2017.
 */
object MenuBeatRepositoryProvider {
    fun provideAddShopRepository(): MenuBeatRepository {
        return MenuBeatRepository(MenuBeatApi.create())
    }
    fun provideAddShopWithoutImageRepository(): MenuBeatRepository {
        return MenuBeatRepository(MenuBeatApi.createWithoutMultipart())
    }

}