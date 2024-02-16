package com.Travel.API.response;

import lombok.Builder;

@Builder
public class RegisterResponse {
	
	
	private String email;

	public RegisterResponse(String email) {
		super();
		this.email = email;
	}

	public RegisterResponse() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
