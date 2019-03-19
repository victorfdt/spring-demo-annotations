package com.elros.spring.demo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author victorfdt
 */
@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.elros.spring.demo.annotations")
public class SportConfig {

	// define a bean for SadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define a bean for SwimCoach AND inject dependency
	@Bean
	public Coach swimCoach(FortuneService service) {
		return new SwimCoach(sadFortuneService());
	}

}
