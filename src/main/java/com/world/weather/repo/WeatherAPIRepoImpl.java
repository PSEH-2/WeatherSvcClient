package com.world.weather.repo;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.world.weather.entity.WeatherData;

@Repository
public class WeatherAPIRepoImpl implements WeatherAPIRepo {
	private String URL = "https://samples.openweathermap.org/data/2.5/forecast?q=city&appid=b6907d289e10d714a6e88b30761fae22";

	public WeatherData getForcast(String city) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		WeatherData result = restTemplate.getForObject(URL.replace("city",city), WeatherData.class);
		return result;
	}
}
