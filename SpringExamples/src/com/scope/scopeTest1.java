package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeTest1 {

	public static void main(String args[]){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Country1 country = (Country1) applicationContext.getBean("counBean1");
		country.setCountryname("india");
		System.out.println("Prototype bean1 "+country.getCountryname());
		Country1 country2 = (Country1) applicationContext.getBean("counBean1");
		System.out.println("Prototype bean2 "+country2.getCountryname());
		// Bean scope is default Singleton
	}
}
