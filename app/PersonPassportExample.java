package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.PersonDao;
import com.cdac.entity.Passport;
import com.cdac.entity.Person;

public class PersonPassportExample {
	
	public static void main(String[] args){
		
		PersonDao dao=new PersonDao();
		
		/*Person per=new Person();
		
		per.setPersName("Neha");
		per.setDateOfBirth(LocalDate.of(1993, 02, 04));
		per.setEmail("nehapriya@gmail.com");
		
		//dao.add(per);
		
		Passport pass=new Passport();
		
		pass.setIssueDate(LocalDate.of(2022, 6, 10));
		pass.setExpiryDate(LocalDate.of(2032,6 , 10));
		pass.setIssuedBy("Govt of India");
		
		per.setPassport(pass);
		pass.setPerson(per);
		dao.add(per);*/
		
		Person p = dao.fetchPersonByPassportNo(15);
		System.out.println(p.getPersName() + " " + p.getEmail());
		
		List<Person> list = dao.fetchPersonsByPassportExpiryYear(2032);
		for(Person person : list)
			System.out.println(person.getPersName()+" "+person.getEmail()+" "+person.getDateOfBirth());
		
		
	}
	
}
