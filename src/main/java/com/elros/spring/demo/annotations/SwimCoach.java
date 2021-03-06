/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elros.spring.demo.annotations;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author victorfdt
 */
//@Component - It is not necessary. The bean is being declared by JavaCode SportConfig 
public class SwimCoach implements Coach {

	//Value injection from property file
	@Value("${foo.email}")
	private String email;

	//Value injection from property file
	@Value("${foo.team}")
	private String team;

	private FortuneService fortuneService;

	/**
	 * Constructor using constructor injection
	 * 
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
