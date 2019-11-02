package com.world.weather.util;

import java.util.List;

import com.world.weather.entity.Weather;
import com.world.weather.entity.WeatherData;

public class WeatherAnalyzer {
	
	public String getNextThreeDaysSuggestion(WeatherData wData)
	{
		List<com.world.weather.entity.List> list = wData.getList();
		for (com.world.weather.entity.List l : list) {
			for (Weather w : l.getWeather()) {
				if (w.getMain().contains("Rain"))
					return "Carry Umberella";
			}
			if (l.getMain().getTempMax() >= 313)
				return "Use Sunscreen lotion";
		}
		return "mid Temp";
	
	}

}
