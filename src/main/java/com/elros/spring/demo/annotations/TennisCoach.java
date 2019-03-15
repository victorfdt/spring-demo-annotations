/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elros.spring.demo.annotations;

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
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice your backand volley";
	}

	/**
	 * The return implementation will be HappyFortuneService, because this is the
	 * only implementation of the interface FortuneService in the container/object
	 * factory.
	 * 
	 * @return
	 */
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
