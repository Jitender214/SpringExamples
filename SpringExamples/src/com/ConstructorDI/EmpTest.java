package com.ConstructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext1.xml");
	Employee emp=(Employee) ac.getBean("emp");
	emp.show();
	}

}
