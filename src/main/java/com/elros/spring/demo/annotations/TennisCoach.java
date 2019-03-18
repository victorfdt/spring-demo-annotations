/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elros.spring.demo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author victorfdt
 */
@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> TennisCoach: inside constructor.");
    }

    /**
     * It will execute AFTER the constructor and BEFORE the dependency
     * injection.
     */
    @PostConstruct
    public void doMySartupStuff() {
        System.out.println(">> TennisCoach: inside doMyStartupStuff()");
    }

    /**
     * It will be executed before the bean is destroyed
     */
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside doMyCleanupStuff()");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backand volley";
    }

    /**
     * The return implementation will be HappyFortuneService, because this is
     * the only implementation of the interface FortuneService in the
     * container/object factory.
     *
     * @return
     */
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
