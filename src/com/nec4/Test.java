package com.nec4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");
		Operation e = (Operation) context.getBean("opbean");
		
		System.out.println("Callig msg function..........");
		e.msg();
		System.out.println("Calling m method..........");
		e.m();
		System.out.println("Calling k method...........");
		e.k();
	}

}
