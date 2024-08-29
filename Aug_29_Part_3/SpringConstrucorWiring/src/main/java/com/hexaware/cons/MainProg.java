package com.hexaware.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/cons/employ.xml");
		Employ employ = (Employ)ctx.getBean("employ1");
		System.out.println(employ);
	}
}
