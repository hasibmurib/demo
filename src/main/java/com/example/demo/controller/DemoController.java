/**
 * 
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Coach;

/**
 * 
 */
@RestController
public class DemoController {
	
//	@Autowired
	private Coach myCoach;
	
	@Autowired
	public DemoController(@Qualifier("tennisCoach") Coach coach) {
		
		System.out.println("In the constructor: "+getClass().getSimpleName());
		myCoach = coach;
	}
	
	
	//@Value("${coach.name}")
	//private String coachName;
	
	@GetMapping("/")
	public String getBlankPagekout() {
		return "Blank Page";
	}
	
	@GetMapping("/dailyWorkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
		
}
