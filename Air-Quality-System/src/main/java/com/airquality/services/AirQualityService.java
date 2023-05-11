package com.airquality.services;

import java.util.List;

import com.airquality.model.AirQuality;

public interface AirQualityService {
	
	public AirQuality createAirQuality(AirQuality airQuality);
	
	public List<AirQuality> getByState(String state);
	
	public AirQuality getByCity(String city);

}
