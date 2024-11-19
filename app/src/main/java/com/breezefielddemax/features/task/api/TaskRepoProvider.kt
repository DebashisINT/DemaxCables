package com.breezefielddemax.features.task.api

import com.breezefielddemax.features.timesheet.api.TimeSheetApi
import com.breezefielddemax.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 12-Aug-20.
 */
object TaskRepoProvider {
    fun taskRepoProvider(): TaskRepo {
        return TaskRepo(TaskApi.create())
    }
}