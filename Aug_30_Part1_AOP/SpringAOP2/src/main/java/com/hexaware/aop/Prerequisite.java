package com.hexaware.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Prerequisite {

	@Pointcut("execution(* com.hexaware.aop.Boarding.*(..))")
	public void assignProject() {}
	@Before("assignProject()")
	public void mcqExam() {
		System.out.println("Pleaes Check cleared all Mcq Exams are Not...");
	}
	
//	@Before("workStation()")
//	public void project() {
//		System.out.println("Hands on Delivered Successfully or not...");
//	}

	
}
