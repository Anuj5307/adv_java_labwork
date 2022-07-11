package com.cdac.component.atmandbank;

import org.springframework.stereotype.Component;

@Component("icicibank")
public class IciciBank implements Bank{

	public boolean isAccountPresent(int accountno) {
		if(accountno==220340360)
			return true;
		else 
			return false;
		
	}

	public void withdraw(int atmid, int accountno, double amount) {
		System.out.println("Person want to withdraw some amount");
		
	}

	
	
}
