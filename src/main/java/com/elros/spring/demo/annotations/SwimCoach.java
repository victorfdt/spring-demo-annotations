/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elros.spring.demo.annotations;

/**
 *
 * @author victorfdt
 */
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    /**
     * Constructor using constructor injection
     * @param service 
     */
    public SwimCoach(FortuneService service) {
        fortuneService = service;
    }

    @Override
    public String getDailyWorkout() {
        return "You need to swim two pools.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
