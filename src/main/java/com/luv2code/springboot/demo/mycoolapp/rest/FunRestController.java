package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// injection properties for coach.name & team.name
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	// expose new endpoint for "teaminfo"
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", Team: " + teamName;
	}

	// expose "/" that return "Hello World"
	 
	@GetMapping("/")
	public String sayHellow() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	
	// expose a new endpoint for "workout"
		@GetMapping("/workout")
		public String getDailyWorkout() {
			return "Run a hard 5k!";
		}

	// expose a new endpoint for "workout"
		@GetMapping("/fortune")
		public String getFortune() {
			return "I have 1 BTC!";
		}
} 
