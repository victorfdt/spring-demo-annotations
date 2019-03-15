/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elros.spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author victorfdt
 */
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService service) {
        fortuneService = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backand volley";
    }
    
    /**
     * The return implementation will be HappyFortuneService,
     * because this is the only implementation of the interface
     * FortuneService in the container/object factory.
     * @return 
     */
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
