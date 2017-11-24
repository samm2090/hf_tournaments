package com.hazfutbol.tournaments.bean;

import java.io.Serializable;

public class FootballCategory implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer footballCategoryId;
	private String name;
	
	public Integer getFootballCategoryId() {
		return footballCategoryId;
	}
	public void setFootballCategoryId(Integer footballCategory) {
		this.footballCategoryId = footballCategory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
