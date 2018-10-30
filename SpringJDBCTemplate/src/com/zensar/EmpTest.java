package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO dao = (EmployeeDAO)applicationContext.getBean("EmpDAO");
		Employee emp = new Employee(222, "javacodegeeks", "Pune");
		dao.saveEmployee(emp);
		System.out.println(emp);
		
	}

}
