package com.airquality.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.airquality.model.AirQuality;

public interface AirQualityRepository extends JpaRepository<AirQuality, Integer> {
	@Query("select A from AirQuality A where A.state=?1")
	public List<AirQuality> byState(String state);

	@Query("select A from AirQuality A where A.city=?1")
	public AirQuality byCity(String city);

}
