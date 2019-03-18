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
public class JavaConfigDemoApp {

    public static void main(String args[]) {

        // read Spring config from configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // retrive the bean from the container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // call method from the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        // close the context
        context.close();
    }

}
