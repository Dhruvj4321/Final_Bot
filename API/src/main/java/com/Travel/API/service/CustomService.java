package com.Travel.API.service;

import org.springframework.stereotype.Service;

import com.Travel.API.entities.*;

@Service
public class CustomService {
	
	public Custom storeData() {
		
		return new Custom("Manali", "4 days", "3 nights", "3 adults", "1 child", "By air", "4 star", 10000);
			
		
	}
	
	public String printCustomDetails() {
		
		Custom tripDetails = storeData();
		
		StringBuilder builder = new StringBuilder();
		builder.append("Location: ").append(tripDetails.getLocation()).append("\n");
        builder.append("Days: ").append(tripDetails.getDays()).append("\n");
        builder.append("Nights: ").append(tripDetails.getNights()).append("\n");
        builder.append("Adults: ").append(tripDetails.getAduld()).append("\n");
        builder.append("Children: ").append(tripDetails.getChildren()).append("\n");
        builder.append("Transport: ").append(tripDetails.getTransport()).append("\n");
        builder.append("Hotel Star: ").append(tripDetails.getHotelStar()).append("\n");
        builder.append("Cost: ").append(tripDetails.getCost()).append("\n");
        
        
		return builder.toString();
		
	}

}
