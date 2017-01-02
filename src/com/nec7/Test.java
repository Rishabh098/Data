package com.nec7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext7.xml");
		Operation e = context.getBean("opBean",Operation.class);
		
		System.out.println("msg method invoked........");
		e.msg();
		System.out.println("m method invoked.........");
		e.m();
		System.out.println("k method invoked........");
		e.k();
	}

}
