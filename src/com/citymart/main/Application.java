package com.citymart.main;

import com.citymart.model.Humidity;
import com.citymart.services.HumidityService;
import com.citymart.services.impl.HumidityServiceImpl;

public class Application {

	public static void main(String[] args) {
		System.out.println("********************* smart-env **********************");
		Humidity hum = new Humidity();
		hum.setLocation("btm");
		
		HumidityService humidityService = new HumidityServiceImpl();
		System.out.println("humidity in btm "+humidityService.calculate(hum));
	}
}
