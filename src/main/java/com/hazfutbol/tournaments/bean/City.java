package com.hazfutbol.tournaments.bean;

import java.io.Serializable;

public class City implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer cityId;
	private Integer provinceId;
	private String cityName;
	
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
