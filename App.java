package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Calculator;
import com.cdac.component.Car;
import com.cdac.component.CurrencyConverter;
import com.cdac.component.HelloWorld;
import com.cdac.component.Login;
import com.cdac.component.School;
import com.cdac.component.atmandbank.Atm;
import com.cdac.component.atmandbank.HdfcAtm;

public class App {
	
	public static void main(String[] args) {
		//loading spring/Ioc container//here we trying spring to loaded in memory
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("my-spring-config.xml");
		//Accessing a particular bean
		//HelloWorld hw=(HelloWorld) ctx.getBean("hello");
		//System.out.println(hw.sayHello("Majrul"));
		//but why we are using spring to create object of HelloWorld class?
		//we could have created object our own like this:-
		//HelloWorld hw=new HelloWorld();
		
		/*Calculator cal=(Calculator) ctx.getBean("calc");
		System.out.println(cal.add(10,20));
		System.out.println(cal.sub(10,20));
		System.out.println(cal.multi(10,20));
		System.out.println(cal.divide(10,20));*/
		/*CurrencyConverter con=(CurrencyConverter) ctx.getBean("currencyConv");
		System.out.println(con.convert("usa", "ind", 1000));
		
		Login login=(Login) ctx.getBean("log");
		System.out.println(login.isValidUser("Anuj","123456"));
		Car car=(Car) ctx.getBean("carengine");
		car.drive();*/
		
		//School sch=(School) ctx.getBean("school");
		//sch.culiculam();
		Atm hda=(Atm) ctx.getBean("hdfcatm");
		//hda.withdraw(220340360, 17850);
		hda.withdraw(220340350, 17860);
	}

}
