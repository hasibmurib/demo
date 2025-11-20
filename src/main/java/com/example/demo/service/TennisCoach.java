package com.example.demo.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Lazy
public class TennisCoach implements Coach {
	
	public TennisCoach() {
		System.out.println("In constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice hard back hand!";
	}
	
	@PostConstruct
	public void startStuff() {
		System.out.println("In startStuff: "+ getClass().getSimpleName());
	}
	
	@PreDestroy
	public void beforeCloseStuff() {
		System.out.println("In before ClosesStuff: "+getClass().getSimpleName());
	}
}
