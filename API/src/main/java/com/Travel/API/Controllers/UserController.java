package com.Travel.API.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Travel.API.request.RegisterRequest;
import com.Travel.API.response.RegisterResponse;
import com.Travel.API.service.UserService;




@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	
	
	
	@PostMapping("saveUser")
	
	public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest){
		
		RegisterResponse registerResponse = service.response(registerRequest);
		
		return new ResponseEntity<>(registerResponse, HttpStatus.CREATED);
		
	}
	
	@PostMapping("verify")

	public ResponseEntity<?> verifyUser(@RequestParam String email, @RequestParam String otp){
		
		
		service.verify(email, otp);
		
		return new ResponseEntity<>("User verified successfully", HttpStatus.OK);
		
	} 
	
}

