package com.breezefielddemax.features.document.api

import com.breezefielddemax.features.dymanicSection.api.DynamicApi
import com.breezefielddemax.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}