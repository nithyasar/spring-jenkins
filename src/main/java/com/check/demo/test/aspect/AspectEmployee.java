package com.check.demo.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectEmployee {
	
	@Before("execution (* com.check.demo.test.*.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint) {
		System.out.println("This has been called before the method execution....." + joinPoint.getSignature());
	}
	
	@After("execution (* com.check.demo.test.*.*.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		System.out.println("This has been called after the method execution....." + joinPoint.getSignature());
	}
	
	@AfterReturning("execution (* com.check.demo.test.*.*.*(..))")
	public void afterReturningMethod(JoinPoint joinPoint) {
		System.out.println("This has been called after successfull method execution....." + joinPoint.getSignature());
	}
	
	@AfterThrowing("execution (* com.check.demo.test.*.*.*(..))")
	public void afterThrowingMethod(JoinPoint joinPoint) {
		System.out.println("This has been called after exception thrown in method execution....." + joinPoint.getSignature());
	}
	

}
