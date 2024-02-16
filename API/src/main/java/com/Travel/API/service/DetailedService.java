package com.Travel.API.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.Travel.API.entities.Activity;
import com.Travel.API.entities.Detailed;
import com.Travel.API.entities.Hotel;

import jakarta.annotation.PostConstruct;

@Service
public class DetailedService {
	
	Map<String, List<Detailed>> map = new HashMap<>();
	
	
	@PostConstruct
	private void init() {
		map.put("Manali",getDetailsManali());
		map.put("Kashmir",getDetailsKashmir());
		map.put("Kerala", getDetailsKerala());
	}
	
	private List<Detailed> getDetailsManali(){
        List<Detailed> detailedListManali = new ArrayList<>();
		
		
        List<Activity> activitiesDay1 = new ArrayList<>();
        activitiesDay1.add(new Activity("River rafting - Manali", "Summary 1", "Details 1", "img1.jpg"));
        activitiesDay1.add(new Activity("Kaya king", "Summary 2", "Details 2", "img2.jpg"));
        Hotel hotelDay1 = new Hotel("Trident", "5-star", "Amenities 1", 200, "img");
        Detailed detailedDay1 = new Detailed("Day 1", activitiesDay1, hotelDay1);
        detailedListManali.add(detailedDay1);

        
        List<Activity> activitiesDay2 = new ArrayList<>();
        activitiesDay2.add(new Activity("Bungee jumping", "Summary 3", "Details 3", "img3.jpg"));
        activitiesDay2.add(new Activity("Para gliding", "Summary 4", "Details 4", "img4.jpg"));
        Hotel hotelDay2 = new Hotel("Oberoi", "4-star", "Amenities 2", 150, "img");
        Detailed detailedDay2 = new Detailed("Day 2", activitiesDay2, hotelDay2);
        detailedListManali.add(detailedDay2);


        return detailedListManali;
		
	}

	
    private List<Detailed> getDetailsKashmir(){
    	List<Detailed> detailedListKashmir = new ArrayList<>();
	
	
	    List<Activity> activitiesDay1 = new ArrayList<>();
	    activitiesDay1.add(new Activity("River rafting - Kashmir", "Summary 1", "Details 1", "img1.jpg"));
	    activitiesDay1.add(new Activity("Kaya king", "Summary 2", "Details 2", "img2.jpg"));
	    Hotel hotelDay1 = new Hotel("Trident", "5-star", "Amenities 1", 200, "img");
	    Detailed detailedDay1 = new Detailed("Day 1", activitiesDay1, hotelDay1);
	    detailedListKashmir.add(detailedDay1);

    
	    List<Activity> activitiesDay2 = new ArrayList<>();
	    activitiesDay2.add(new Activity("Bungee jumping", "Summary 3", "Details 3", "img3.jpg"));
	    activitiesDay2.add(new Activity("Para gliding", "Summary 4", "Details 4", "img4.jpg"));
	    Hotel hotelDay2 = new Hotel("Oberoi", "4-star", "Amenities 2", 150, "img");
	    Detailed detailedDay2 = new Detailed("Day 2", activitiesDay2, hotelDay2);
	    detailedListKashmir.add(detailedDay2);


        return detailedListKashmir;
	
	}

	private List<Detailed> getDetailsKerala(){
		List<Detailed> detailedListKerala = new ArrayList<>();
		
		
	    List<Activity> activitiesDay1 = new ArrayList<>();
	    activitiesDay1.add(new Activity("River rafting - Kerala", "Summary 1", "Details 1", "img1.jpg"));
	    activitiesDay1.add(new Activity("Kaya king", "Summary 2", "Details 2", "img2.jpg"));
	    Hotel hotelDay1 = new Hotel("Trident", "5-star", "Amenities 1", 200, "img");
	    Detailed detailedDay1 = new Detailed("Day 1", activitiesDay1, hotelDay1);
	    detailedListKerala.add(detailedDay1);
	
	    
	    List<Activity> activitiesDay2 = new ArrayList<>();
	    activitiesDay2.add(new Activity("Activity 3", "Summary 3", "Details 3", "img3.jpg"));
	    activitiesDay2.add(new Activity("Activity 4", "Summary 4", "Details 4", "img4.jpg"));
	    Hotel hotelDay2 = new Hotel("Hotel 2", "4-star", "Amenities 2", 150, "img");
	    Detailed detailedDay2 = new Detailed("Day 2", activitiesDay2, hotelDay2);
	    detailedListKerala.add(detailedDay2);
	
	
	    return detailedListKerala;
		
	}


	public List<Detailed> getData(String plan){//have a param
		
		return map.get(plan);
	}
	
	public static String printDetailsManali(List<Detailed> detailedListManali) {
        StringBuilder result = new StringBuilder();
        for (Detailed detailed : detailedListManali) {
            result.append("Day: ").append(detailed.getDay()).append("\n");

            result.append("Activities:\n");
            for (Activity activity : detailed.getActiviies()) {
                result.append(" - ").append(activity.getTitle()).append("\n").append(activity.getImgurl()).append("\n");
            }

            result.append("Hotel: ").append(detailed.getHoelInfo().getName()).append("\n").append(detailed.getHoelInfo().getImgurl()).append("\n");
            result.append("--------------\n");
        }
        return result.toString();
    }
	
	
	
	public static String printDetailsKashmir(List<Detailed> detailedListKashmir) {
        StringBuilder result = new StringBuilder();
        for (Detailed detailed : detailedListKashmir) {
            result.append("Day: ").append(detailed.getDay()).append("\n");

            result.append("Activities:\n");
            for (Activity activity : detailed.getActiviies()) {
                result.append(" - ").append(activity.getTitle()).append("\n").append(activity.getImgurl()).append("\n");
            }

            result.append("Hotel: ").append(detailed.getHoelInfo().getName()).append("\n").append(detailed.getHoelInfo().getImgurl()).append("\n");
            result.append("--------------\n");
        }
        return result.toString();
    }
	
	
	public static String printDetailsKerala(List<Detailed> detailedListKerala) {
        StringBuilder result = new StringBuilder();
        for (Detailed detailed : detailedListKerala) {
            result.append("Day: ").append(detailed.getDay()).append("\n");

            result.append("Activities:\n");
            for (Activity activity : detailed.getActiviies()) {
                result.append(" - ").append(activity.getTitle()).append("\n").append(activity.getImgurl()).append("\n");
            }

            result.append("Hotel: ").append(detailed.getHoelInfo().getName()).append("\n").append(detailed.getHoelInfo().getImgurl()).append("\n");
            result.append("--------------\n");
        }
        return result.toString();
    }
	
	
	

}