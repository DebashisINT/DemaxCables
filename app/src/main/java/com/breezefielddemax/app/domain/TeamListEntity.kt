package com.breezefielddemax.app.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.breezefielddemax.app.AppConstant

@Entity(tableName = AppConstant.TEAM_LIST)
data class TeamListEntity (
    @PrimaryKey(autoGenerate = true) var sl_no: Int = 0,
    @ColumnInfo var user_id:String = "",
    @ColumnInfo var user_name:String = "",
    @ColumnInfo var contact_no:String = "",
    )