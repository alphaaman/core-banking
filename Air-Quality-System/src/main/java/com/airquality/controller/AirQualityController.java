package com.airquality.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airquality.model.AirQuality;
import com.airquality.services.AirQualityService;

@RestController
@RequestMapping("/api/v1/airquality")
public class AirQualityController {
	
	@Autowired
	private AirQualityService service;

	public AirQualityController(AirQualityService service) {
		this.service = service;
	}
	@GetMapping("h1")
	public String check(){
	return "air is running";
	}
	@PostMapping
	public ResponseEntity<AirQuality> createAirQuality(@RequestBody AirQuality airQuality){
		AirQuality savedAirQuality = service.createAirQuality(airQuality);
		return new ResponseEntity<AirQuality>(savedAirQuality,HttpStatus.CREATED);
	}
	
	@GetMapping("/state/{state}")
	public ResponseEntity<List<AirQuality>> getAirQualityByState(@PathVariable String state){
		List<AirQuality> findByState = service.getByState(state);
		return new ResponseEntity<List<AirQuality>>(findByState,HttpStatus.OK);
	}
	
	@GetMapping("/city/{city}")
	public ResponseEntity<AirQuality> getAirQualityByCity(@PathVariable String city){
		AirQuality findByCity = service.getByCity(city);
		return new ResponseEntity<AirQuality>(findByCity,HttpStatus.OK);
	}
	
	

}
