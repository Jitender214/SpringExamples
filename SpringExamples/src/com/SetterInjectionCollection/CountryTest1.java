package com.SetterInjectionCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryTest1 {

	public static void main(String[] args) {
		System.out.println("Mainnnnnnnnnnnnnnnnnnnn");
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext1.xml");
		Country1 c = (Country1)ac.getBean("countr");
		c.displayInfo();
	}
}
