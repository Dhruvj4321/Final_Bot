package com.Travel.API.entities;

public class Custom {
	
	String location;

	String days;

	String nights;
	
	String aduld, children;
	
	String transport, hotelStar;
	
	int cost;

	public Custom(String location, String days, String nights, String aduld, String children, String transport,
			String hotelStar, int cost) {
		super();
		this.location = location;
		this.days = days;
		this.nights = nights;
		this.aduld = aduld;
		this.children = children;
		this.transport = transport;
		this.hotelStar = hotelStar;
		this.cost = cost;
	}

	public Custom() {
		super();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getAduld() {
		return aduld;
	}

	public void setAduld(String aduld) {
		this.aduld = aduld;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getHotelStar() {
		return hotelStar;
	}

	public void setHotelStar(String hotelStar) {
		this.hotelStar = hotelStar;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	

}
