package com.Travel.API.entities;

public class Display {
	
	String imgurl;
	
	float rating;
	
	String days, nights;
	
	String title;
	
	int cost;
	
	

	public Display(String imgurl, float rating, String days, String nights, String title, int cost) {
		super();
		this.imgurl = imgurl;
		this.rating = rating;
		this.days = days;
		this.nights = nights;
		this.title = title;
		this.cost = cost;
		
	}

	public Display() {
		super();
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getNights() {
		return nights;
	}

	public void setNights(String nights) {
		this.nights = nights;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	
	

}
