package com.world.weather;

import java.io.IOException;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.world.weather.entity.Weather;
import com.world.weather.entity.WeatherData;
import com.world.weather.thirdpartservice.OpenWeatherMap;
import com.world.weather.thirdpartservice.WeatherDataHandler;

@RestController
@RequestMapping("/api/latest")
public class WeatherControlller {
	@RequestMapping("/status")
	public String status() {
		return "Weather forcast working fine!";
	}

	@RequestMapping(value="/forecast/{country}")
	public String forcast(@PathVariable("country") String country) throws IOException {
		WeatherDataHandler weatherMap = new WeatherDataHandler();
		WeatherData data= weatherMap.getForcast(country);
		List<com.world.weather.entity.List> list = data.getList();
		for(com.world.weather.entity.List l : list)
		{
			for(Weather w : l.getWeather())
			{
				if(w.getMain().contains("Rain"))
					return "Carry Umberella";
			}
			if(l.getMain().getTempMax()>=313)
				return "Use Sunscreen lotion";
		}
		return "mid Temp";
	}
}
