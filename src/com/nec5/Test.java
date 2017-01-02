package com.nec5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
		Operation e = (Operation) context.getBean("opBean");
		
		System.out.println("msg method invoked........");
		e.msg();
		System.out.println("m method invoked.....");
		e.m();
		System.out.println("k method invoked.......");
		e.k();
	}

}
