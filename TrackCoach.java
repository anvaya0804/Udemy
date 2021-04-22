package com.udemy.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyFortune() {

		return "Just do it!" + fortuneService.getFortune();
	}

}
