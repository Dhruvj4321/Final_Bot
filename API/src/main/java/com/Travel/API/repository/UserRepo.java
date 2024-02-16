package com.Travel.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Travel.API.entities.User;



public interface UserRepo extends JpaRepository<User, String> {
	
	
	User findByEmail(String email);

}
