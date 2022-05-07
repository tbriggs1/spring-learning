package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService{
	
	@Override
	public String getFortune() {
		return "You've got such a good fortune today!";
	}
}
