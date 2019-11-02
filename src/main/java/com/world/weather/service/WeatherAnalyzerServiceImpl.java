package com.world.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.world.weather.repo.WeatherAPIRepo;
import com.world.weather.util.WeatherAnalyzer;

@Service
public class WeatherAnalyzerServiceImpl implements WeatherAnalyzerService {
	
	@Autowired
	private WeatherAPIService service;

	@Override
	public String getWeatherAnalysis(String city) throws Exception {
		
		WeatherAnalyzer analyzer = new WeatherAnalyzer();
		return analyzer.getNextThreeDaysSuggestion(service.getForcast(city));
	}

}
