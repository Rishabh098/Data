package com.nec8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext8.xml");
		Operation e = context.getBean("opBean",Operation.class);
		
		e.validate(12);
	}

}
