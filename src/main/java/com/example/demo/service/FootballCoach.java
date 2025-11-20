package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class FootballCoach implements Coach {
	
	public FootballCoach() {
		System.out.println("In constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice dribbling as much as possible";
	}

}
