package com.ConstructDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)applicationContext.getBean("studentBean");
		
		int sno = student.getSno();
		String sname = student.getSname();
		String add = student.getAdd().getAddress();
		System.out.println(sno+" name is "+sname+" address is "+add);
	}

}
