package com.example.weatherappagain.Repository

import com.example.weatherappagain.server.ApiServices

class WeatherRepository(val api:ApiServices) {
    fun getCurrentWeather(lat:Double,lng:Double,unit:String)=
        api.getCurrentWeather(lat,lng,unit,"042c2ddfb3f95fa918336e6edbd4fe63")
}
