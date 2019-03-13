/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elros.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author victorfdt
 */
public class AnnotationsDemoApp {
    
    public static void main(String args[]){
        
        // read Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrive the bean from the container
        Coach tennisCoach = context.getBean("thatSillyCoach", Coach.class);
        
        // call method from the bean
        System.out.println(tennisCoach.getDailyWorkout());
        
        // close the context
        context.close();
    }
    
}
