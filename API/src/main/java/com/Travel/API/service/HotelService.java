package com.Travel.API.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Travel.API.entities.Hotel;

@Service
public class HotelService {
	
	public List<Hotel> fetchHotels(){
		
		List<Hotel> hotelList = new ArrayList<>();
		
		hotelList.add(new Hotel("Hotel 1", "5-star", "Amenities 1", 20000, "img"));
		hotelList.add(new Hotel("Hotel 2", "4-star", "Amenities 2", 10000, "img"));
		hotelList.add(new Hotel("Hotel 3", "3-star", "Amenities 3", 5000, "img"));
		
		return hotelList; 
				
	}
	
	
}
