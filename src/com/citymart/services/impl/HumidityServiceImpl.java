package com.citymart.services.impl;

import com.citymart.model.Humidity;
import com.citymart.services.HumidityService;

public class HumidityServiceImpl implements HumidityService{

	@Override
	public double calculate(Humidity humidity) {
		if(humidity.getLocation().equals("btm"))
		{
			return 35;
		}
		return 0;
	}

	
}
