package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeTest {

	public static void main(String args[]){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Country country = (Country) applicationContext.getBean("counBean");
		//country.setCountryname("India");
		System.out.println("Singleton bean1 "+country.getCountryname());
		Country country2 = (Country) applicationContext.getBean("counBean");
		System.out.println("Singleton bean2 "+country2.getCountryname());
		// Bean scope is default Singleton
	}
}
