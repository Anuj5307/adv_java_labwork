package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("log")
public class Login {

	public boolean isValidUser(String username,String password) {
		
		if(username.equals("Anuj")&& password.equals("123456"))
				return true;
		return false;
		
		
	}
}
