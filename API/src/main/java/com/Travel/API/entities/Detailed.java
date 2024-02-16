package com.Travel.API.entities;

import java.util.List;

public class Detailed {
	
	String day;
	
	List<Activity> activiies;
	
	Hotel hoelInfo;

	public Detailed(String day, List<Activity> activiies, Hotel hoelInfo) {
		super();
		this.day = day;
		this.activiies = activiies;
		this.hoelInfo = hoelInfo;
	}

	public Detailed() {
		super();
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public List<Activity> getActiviies() {
		return activiies;
	}

	public void setActiviies(List<Activity> activiies) {
		this.activiies = activiies;
	}

	public Hotel getHoelInfo() {
		return hoelInfo;
	}

	public void setHoelInfo(Hotel hoelInfo) {
		this.hoelInfo = hoelInfo;
	}
	
	

}
