package com.Travel.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		String springBootVersion = SpringBootVersion.getVersion();
        System.out.println("Spring Boot Version: " + springBootVersion);
	} 

}
