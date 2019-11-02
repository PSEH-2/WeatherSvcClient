package com.world.weather.thirdpartservice;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.InputSource;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.world.weather.entity.WeatherData;

import java.io.IOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WeatherDataHandler {
	WeatherData weatherData = new WeatherData();
	OpenWeatherMap openWeatherMap = new OpenWeatherMap();
	 public static String getCharacterDataFromElement(Element e) {
		    Node child = e.getFirstChild();
		    if (child instanceof CharacterData) {
		      CharacterData cd = (CharacterData) child;
		      return cd.getData();
		    }
		    return "";
		  }
	public WeatherData getForcast(String country) throws IOException {
		String strData;
		//System.out.println("Gettting forcast");
		
			WeatherData weatherData = openWeatherMap.getForcast(country);
		    return weatherData;		
	}
	
	public void parseWeatherData(String data) {
		
	}
	
}
