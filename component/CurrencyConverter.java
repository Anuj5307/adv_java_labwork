package com.cdac.component;

import org.springframework.stereotype.Component;


@Component("currencyConv")
public class CurrencyConverter {

	
	public double convert(String from, String to, double amount) {
		
		if (from.equals("usa") && to.equals("ind"))
			return  78*amount;
		else if(from.equals("pound") && to.equals("rupee"))
			return 94.40*amount;
		else 
			return 0;
	}
}
