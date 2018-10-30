package com.SetterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDI {

	public static void main(String[] args){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Country country = (Country)applicationContext.getBean("countryBean");
		String countryname = country.getCountryname();
		String capitalname = country.getCapital().getCapitalName();
		System.out.println(countryname+" and the capital is "+capitalname);
	}
}
