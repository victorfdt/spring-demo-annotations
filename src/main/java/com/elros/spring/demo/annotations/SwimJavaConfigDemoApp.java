/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elros.spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author victorfdt
 */
public class SwimJavaConfigDemoApp {

	public static void main(String args[]) {

		// read Spring Java configuration class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from the container
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

		// using bean methods
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());

		// call new swim coach methods. Those variables are receiving value injection
		// from a property file
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getTeam());

		// close the context
		context.close();
	}

}
