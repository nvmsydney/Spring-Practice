package com.luv2code.springdemo;

public class SoccerCoach implements Coach {
    private FortuneService fortuneService;
    public SoccerCoach() {
    }

    public SoccerCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Kick the ball into the goal";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
