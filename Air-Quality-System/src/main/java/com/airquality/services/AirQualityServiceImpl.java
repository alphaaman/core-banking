package com.airquality.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airquality.model.AirQuality;
import com.airquality.repository.AirQualityRepository;

@Service
public class AirQualityServiceImpl implements AirQualityService {

	@Autowired
	private AirQualityRepository airQualityRepo;

	
	public AirQualityServiceImpl(AirQualityRepository airQualityRepo) {
		this.airQualityRepo = airQualityRepo;
	}

	@Override
	public AirQuality createAirQuality(AirQuality airQuality) {

		return airQualityRepo.save(airQuality);
	}

	@Override
	public List<AirQuality> getByState(String state) {

		return airQualityRepo.byState(state);
	}

	@Override
	public AirQuality getByCity(String city) {

		return airQualityRepo.byCity(city);
	}

}
