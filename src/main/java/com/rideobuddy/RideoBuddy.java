package com.rideobuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class RideoBuddy {

	public static void main(String[] args) {
		System.out.println("Starting the ride-o-buddy app now");
		SpringApplication.run(RideoBuddy.class, args);
	}

}
