package com.nec8;

public class Operation {

	public void validate(int age)throws Exception{
		if(age<18){
			throw new ArithmeticException("Not valid Age!");
		}
		else{
			System.out.println("Thanks for vote");
		}
	}
}
