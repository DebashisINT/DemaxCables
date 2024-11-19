package com.breezefielddemax.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefielddemax.app.FileUtils
import com.breezefielddemax.app.Pref
import com.breezefielddemax.base.BaseResponse
import com.breezefielddemax.features.addshop.model.AddLogReqData
import com.breezefielddemax.features.addshop.model.AddShopRequestData
import com.breezefielddemax.features.addshop.model.AddShopResponse
import com.breezefielddemax.features.addshop.model.LogFileResponse
import com.breezefielddemax.features.addshop.model.UpdateAddrReq
import com.breezefielddemax.features.contacts.CallHisDtls
import com.breezefielddemax.features.contacts.CompanyReqData
import com.breezefielddemax.features.contacts.ContactMasterRes
import com.breezefielddemax.features.contacts.SourceMasterRes
import com.breezefielddemax.features.contacts.StageMasterRes
import com.breezefielddemax.features.contacts.StatusMasterRes
import com.breezefielddemax.features.contacts.TypeMasterRes
import com.breezefielddemax.features.dashboard.presentation.DashboardActivity
import com.breezefielddemax.features.login.model.WhatsappApiData
import com.breezefielddemax.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}