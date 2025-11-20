package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class HockeyCoach implements Coach {
	
	
	public HockeyCoach() {
		System.out.println("In constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice on the ice more often";
	}

}
