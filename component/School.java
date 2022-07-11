package com.cdac.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("school")
public class School {
	
	@Autowired
	private Student student;
	
	public void culiculam() {
		
		
		student.sports();
		student.cultural();
		student.atheletics();
		student.debate();
		
	}

}
