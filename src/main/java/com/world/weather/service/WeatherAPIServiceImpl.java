package com.world.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.weather.entity.WeatherData;
import com.world.weather.repo.WeatherAPIRepo;

@Service
public class WeatherAPIServiceImpl implements WeatherAPIService {

	@Autowired
	private WeatherAPIRepo WeatherAPIRepo;
	
	@Override
	public WeatherData getForcast(String city) throws Exception {
		return WeatherAPIRepo.getForcast(city);
	}

}
