package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("Enginecar")
public class Engine {

	public void on() {
		System.out.println("car is about to on");
		
	}
	public void off() {
		System.out.println("car is made forcefully off");
		
	}
}
