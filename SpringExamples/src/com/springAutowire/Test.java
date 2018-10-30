package com.springAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		State state = (State) applicationContext.getBean("state");
		String statename = state.getDistrict().getDistrictNames();
		System.out.println("District name is : "+statename);
	}

}
