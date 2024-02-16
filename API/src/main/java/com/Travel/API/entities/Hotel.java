package com.Travel.API.entities;

public class Hotel {
	
	String name;
	
	String star;
	
	String amenities;
	
	int price;
	
	String imgurl;

	public Hotel(String name, String star, String amenities, int price, String imgurl) {
		super();
		this.name = name;
		this.star = star;
		this.amenities = amenities;
		this.price = price;
		this.imgurl = imgurl;
	}

	public Hotel() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	
	
	

}
