/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elros.spring.demo.annotations;

import org.springframework.stereotype.Component;

/**
 *
 * @author victorfdt
 */
//@Component - It is not necessary. The bean is being declared by JavaCode SportConfig 
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today will be a sad day :(";
	}
}
