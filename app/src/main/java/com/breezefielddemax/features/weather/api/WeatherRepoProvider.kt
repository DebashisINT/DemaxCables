package com.breezefielddemax.features.weather.api

import com.breezefielddemax.features.task.api.TaskApi
import com.breezefielddemax.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}