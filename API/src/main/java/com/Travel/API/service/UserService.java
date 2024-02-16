package com.Travel.API.service;

import com.Travel.API.request.RegisterRequest;
import com.Travel.API.response.RegisterResponse;

public interface UserService {
	
	
    public RegisterResponse response(RegisterRequest request);
	
	public void verify(String email, String otp);
	

}
