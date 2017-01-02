package com.nec3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		Validator valid = context.getBean("proxy",Validator.class);
		
		valid.validate(20);
	}

}
