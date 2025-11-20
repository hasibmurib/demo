package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class CricketCoach implements Coach {
	
	public CricketCoach() {
		System.out.println("In constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice spin bowling for 30 minutes";
	}

}
