package com.cdac.component.atmandbank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hdfcatm")
public class HdfcAtm implements Atm{

		@Autowired
	private List<Bank> banks;
	
	public void withdraw(int accountno, double amount) {
		System.out.println("people at HDFC ATM want to withdraw money");
	  Bank	currentbank=null;
		for(Bank bank:banks)
			if(bank.isAccountPresent(accountno)) {
				currentbank=bank;
		      break;
		      }
		currentbank.withdraw(12345, accountno, amount);
	}
     
	
}
