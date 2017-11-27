package org.pk.weather.earthquake.data;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Earthquake {

	@Id
	private Integer id;
	
	private String description;
	private Double magnitude;
	private Double latitude;
	private Double longitude;
	private Date date;
	
	public Earthquake(){}
	
	public Earthquake(Integer id, String description, Double magnitude, Double latitude, Double longitude, Date date) {
		super();
		this.id = id;
		this.description = description;
		this.magnitude = magnitude;
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(Double magnitude) {
		this.magnitude = magnitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Earthquake[id=%s, description='%s', magnitude='%s', latitude='%s', longitude='%s', date='%s']",
                id, description, magnitude, latitude, longitude, date);
    }
	
}
