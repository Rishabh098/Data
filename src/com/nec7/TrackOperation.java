package com.nec7;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("execution(* Operation.*(..))")
	public void abcpointcut(){
		
	}
	@Around("abcpointcut()")
	public Object myadvice(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("Additional Concern Before calling actual method");  
        Object obj=jp.proceed();  
        System.out.println("Additional Concern After calling actual method"); 
        return obj;
	}
}
