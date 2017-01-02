package com.nec8;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TrackOperation {

	@AfterThrowing(pointcut="execution(* Operation.*(..))",
            throwing= "error")
	public void myAdvice(JoinPoint jp, Throwable error){
		System.out.println("additional concern");
		System.out.println("Method Signature: "+jp.getSignature());
		System.out.println("Exception is:"+error);
		System.out.println("End of advice");
	}
}
