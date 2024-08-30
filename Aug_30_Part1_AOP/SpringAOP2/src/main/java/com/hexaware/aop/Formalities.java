package com.hexaware.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Formalities {

	@Pointcut("execution(* com.hexaware.aop.SegueTraining.*(..))")
	public void startTraining() {}
	
	@Before("startTraining()")
	public void trainerAlloc() {
		System.out.println("Trainer to be assigned to this Batch...");
	}
	
	@After("startTraining()")
	public void crossCheckExam() {
		System.out.println("Exams to be Cleared to be Checked...");
	}
	
	@AfterReturning(
			pointcut = "execution(* com.hexaware.aop.SegueTraining.*(..))",
			returning = "result")
	public void myadvice(JoinPoint jp, Object result) {
		System.out.println("Additional Output");
		System.out.println("Method Signature  " + jp.getSignature());
		System.out.println("Result  " +result);
	}
}
