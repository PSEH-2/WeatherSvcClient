package com.world.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.world.weather.entity.WeatherData;
import com.world.weather.repo.WeatherAPIRepo;
import com.world.weather.service.WeatherAnalyzerService;

@RestController
@RequestMapping("/api/latest")
public class WeatherAnalyzerControlller {

	@Autowired
	private WeatherAnalyzerService weatherAnalyzerService;

	@RequestMapping("/status")
	public String status() {
		return "Weather forcast working fine!";
	}

	@RequestMapping(value = "/forecast/{country}")
	public String forcast(@PathVariable("country") String country) throws Exception {
		
		return weatherAnalyzerService.getWeatherAnalysis(country);
	}
		
}
