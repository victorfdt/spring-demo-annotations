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
public class AnnotationBeanScopeDemoApp {

    public static void main(String args[]) {

        // load Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the beans from the container (object factory)
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they have the same reference
        boolean result = (theCoach == alphaCoach);
        String text = result ? "Yes" : "No";

        // use the method from the bean
        System.out.println("Are they pointing to the same object / reference  in memory? Answer: " + text);
        System.out.println("Location is memory theCoach: " + theCoach);
        System.out.println("Location is memory alphaCoach: " + alphaCoach);

        // close the context
        context.close();
    }

}
