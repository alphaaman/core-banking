package com.airquality.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AirQualitySystem")
public class AirQuality {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AirQualityId")
	private int airQualityId;
	@Column(name = "State")
	private String state;
	@Column(name = "City")
	private String city;
	@Column(name = "AirQualityIndex")
	private int AQI;

	public AirQuality() {
		super();
	}

	public AirQuality(int airQualityId, String state, String city, int aQI) {
		super();
		this.airQualityId = airQualityId;
		this.state = state;
		this.city = city;
		AQI = aQI;
	}

	public int getAirQualityId() {
		return airQualityId;
	}

	public void setAirQualityId(int airQualityId) {
		this.airQualityId = airQualityId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAQI() {
		return AQI;
	}

	public void setAQI(int aQI) {
		AQI = aQI;
	}

	@Override
	public String toString() {
		return "AirQuality [airQualityId=" + airQualityId + ", state=" + state + ", city=" + city + ", AQI=" + AQI
				+ "]";
	}

}
