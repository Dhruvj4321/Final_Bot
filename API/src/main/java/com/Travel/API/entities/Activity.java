package com.Travel.API.entities;

public class Activity {
	
	String title;
	
	String summary;
	
	String details;
	
	String imgurl;

	public Activity(String title, String summary, String details, String imgurl) {
		super();
		this.title = title;
		this.summary = summary;
		this.details = details;
		this.imgurl = imgurl;
	}

	public Activity() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	
	

}
