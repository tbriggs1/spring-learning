package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public FootballCoach() {
		System.out.println("Football Coach: We are in the no-arg constructor");
	}

	
	// Setting method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Football Coach: Weare in the setting method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "20 shoots at goal";
	}
	
	@Override
	public String getFortune() {
		return this.fortuneService.getFortune();
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
}
