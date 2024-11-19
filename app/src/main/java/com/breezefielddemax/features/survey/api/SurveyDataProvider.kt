package com.breezefielddemax.features.survey.api

import com.breezefielddemax.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefielddemax.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}