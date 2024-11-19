package com.breezefielddemax.app.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.breezefielddemax.app.AppConstant

@Entity(tableName = AppConstant.CRASH_REPORTS)
data class CrashReportEntity(
    @PrimaryKey(autoGenerate = true) val sl_no: Int = 0,
    val timestamp: Long,
    val errorMessage: String,
    val stackTrace: String
)