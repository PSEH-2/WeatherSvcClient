package com.world.weather.thirdpartservice;

import java.io.IOException;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.world.weather.entity.WeatherData;

public class OpenWeatherMap {
	private String URL = "http://api.openweathermap.org/data/2.5/forecast?q=country&mode=json&appid=d2929e9483efc82c82c32ee7e02d563e";

	private static ObjectMapper objMapper = new ObjectMapper();
	public WeatherData getForcast(String country) throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		WeatherData result = restTemplate.getForObject(URL.replace("country",country), WeatherData.class);
		return result;
	}
}
