package com.cdac.component.atmandbank;

import org.springframework.stereotype.Component;
@Component("bankofindia")

public class Bankofindia {
	

		public boolean isAccountPresent(int accountno) {
			if(accountno==220340350)
				return true;
			else 
				return false;
			
		}

		public void withdraw(int atmid, int accountno, double amount) {
			System.out.println("Person enjoy the service of Atm");
		}

		
		
	}


