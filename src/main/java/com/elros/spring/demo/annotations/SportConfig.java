package com.elros.spring.demo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author victorfdt
 */
@Configuration
public class SportConfig {

    // define a bean for SadFortuneService
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define a bean for SwimCoach AND inject dependecy
    @Bean
    public Coach swimCoach(FortuneService service) {
        return new SwimCoach(sadFortuneService());
    }

}
