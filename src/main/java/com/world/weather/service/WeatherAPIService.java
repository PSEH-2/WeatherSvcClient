package com.world.weather.service;

import com.world.weather.entity.WeatherData;

public interface WeatherAPIService {
	public WeatherData getForcast(String city) throws Exception ;

}
