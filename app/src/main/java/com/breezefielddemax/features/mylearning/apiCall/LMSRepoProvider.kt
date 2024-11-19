package com.breezefielddemax.features.mylearning.apiCall

import com.breezefielddemax.features.login.api.opportunity.OpportunityListApi
import com.breezefielddemax.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}