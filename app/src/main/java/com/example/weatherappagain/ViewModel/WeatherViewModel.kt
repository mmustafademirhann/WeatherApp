package com.example.weatherappagain.ViewModel

import androidx.lifecycle.ViewModel
import com.example.weatherappagain.Repository.WeatherRepository
import com.example.weatherappagain.server.ApiClient
import com.example.weatherappagain.server.ApiServices

class WeatherViewModel(val repository: WeatherRepository):ViewModel() {
    constructor():this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurremtWeather(lat:Double,lng:Double,unit:String)=
        repository.getCurrentWeather(lat,lng,unit)
}