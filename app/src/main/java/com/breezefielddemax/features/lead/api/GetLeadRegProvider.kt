package com.breezefielddemax.features.lead.api

import com.breezefielddemax.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefielddemax.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}