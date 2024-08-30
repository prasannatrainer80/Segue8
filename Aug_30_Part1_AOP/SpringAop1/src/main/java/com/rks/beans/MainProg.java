package com.rks.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class MainProg {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/rks/beans/spring.xml");
		Opeartion e=(Opeartion)context.getBean("opBean");
	      System.out.println("Calling msg");
	      e.msg();
	      System.out.println("Calling m");
	      e.m();
	      System.out.println("Calling k");
	      e.k();
	}
}
