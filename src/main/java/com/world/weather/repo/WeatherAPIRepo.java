package com.world.weather.repo;

import com.world.weather.entity.WeatherData;

public interface WeatherAPIRepo {
	public WeatherData getForcast(String country) throws Exception ;

}
