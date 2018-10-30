package com.zensar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
				Customer customer = (Customer)applicationContext.getBean("cust");
				System.out.println(customer.getList());
	}

}
