package com.Travel.API.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Travel.API.entities.Display;

@Service
public class DisplayService {
	
	public List<Display> fetchAll() {
		
		List<Display> displayList = new ArrayList<>();
		
		displayList.add(new Display("image_url_1", 4.5f, "5 days", "4 nights", "MANALI", 100000));
		displayList.add(new Display("image_url_2", 3.5f, "6 days", "5 nights", "KASHMIR", 150000));
		displayList.add(new Display("image_url_3", 2.5f, "9 days", "8 nights", "KERELA", 200000));
		
		return displayList;
		
	}

}
