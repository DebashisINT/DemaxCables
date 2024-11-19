package com.breezefielddemax.app.domain

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.breezefielddemax.app.AppConstant

@Dao
interface CrashReportDao {
    @Insert
    fun insertCrashReport(crashReport: CrashReportEntity)

    @Query("SELECT * FROM crash_reports ORDER BY timestamp DESC")
    fun getAllCrashReports(): List<CrashReportEntity>
}