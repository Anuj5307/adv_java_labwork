package com.cdac.component.atmandbank;

public interface Bank {
	public boolean isAccountPresent(int accountno);
	public void withdraw(int atmid ,int accountno, double amount);
}
