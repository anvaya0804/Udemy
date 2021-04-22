package com.udemy.springdemo;

public class CricketCoach implements Coach {

	// Private variables 
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;

	//Getter method for EMAIL-ADDRESS
	public String getEmailAddress() {
		return emailAddress;
	}
	
	//Setter method for EMAILADDRESS
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside the setter method of mail!");
		this.emailAddress = emailAddress;
	}
	
	//TEAM GETTER
	public String getTeam() {
		return team;
	}
	
	//TEAM SETTER
	public void setTeam(String team) {
		System.out.println("Inside the setter method of team!");
		this.team = team;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice for 2hrs in the nets";
	}
	
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	
	public CricketCoach() {
		
	 
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method!");
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyFortune() {
		
		return "RCB!"+ fortuneService.getFortune();
	}

}
