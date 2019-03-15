package com.elros.spring.demo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of String
	private String[] data = { 
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journy is the reward"
	};

	// create a random number generator
	private Random random = new Random();

	@Override
	public String getFortune() {
		// pick up a random string from the array
		int index = random.nextInt(data.length);

		return data[index];
	}

}
