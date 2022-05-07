package com.luv2code.springdemo;

public class RugbyCoach implements Coach{
	
	private FortuneService fortuneServer;
	
	public RugbyCoach() {
		
	}
	
	public RugbyCoach(FortuneService fortuneServer) {
		super();
		this.fortuneServer = fortuneServer;
	}

	public String getDailyWorkout() {
		return "30 minutes of hill running";
	}

	@Override
	public String getFortune() {
		return this.fortuneServer.getFortune();
	}
}
