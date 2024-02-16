package com.Travel.API.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Travel.API.entities.Detailed;
import com.Travel.API.entities.Display;
import com.Travel.API.entities.Hotel;
import com.Travel.API.service.CustomService;
import com.Travel.API.service.DetailedService;
import com.Travel.API.service.DisplayService;
import com.Travel.API.service.HotelService;




@RestController
public class displayPlan {
	
	@Autowired
	DisplayService service;
	
	@Autowired
	DetailedService detailService;
	
	@Autowired
	HotelService hotelService;
	
	@Autowired
	CustomService customService;
	
	
	@GetMapping("getPlans")
	
	public List<Display> getAllPlans(){
		
		return service.fetchAll();
		
	}
	
	@GetMapping("detailedPlan")
	
	public List<Detailed> getDetailedPlan(@RequestParam String plan) {
        List<Detailed> result = detailService.getData(plan);
        
       
        return result;
    }
	
	@GetMapping("getHotels")
	
	public List<Hotel> geAllHotels(){
		
		return hotelService.fetchHotels();		
		
	}
	
	@GetMapping("customPlan")
	
	public String customPlanTrip() {
		
		return customService.printCustomDetails();
		
	}

}
