package com.breezefielddemax.features.weather.api

import com.breezefielddemax.base.BaseResponse
import com.breezefielddemax.features.task.api.TaskApi
import com.breezefielddemax.features.task.model.AddTaskInputModel
import com.breezefielddemax.features.weather.model.ForeCastAPIResponse
import com.breezefielddemax.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}