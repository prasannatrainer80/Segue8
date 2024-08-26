package com.hexaware.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/spring/Name.xml");
		NameDaoImpl impl1 = (NameDaoImpl)ctx.getBean("name1");
		NameDaoImpl impl2 = (NameDaoImpl)ctx.getBean("name2");
		NameDaoImpl impl3 = (NameDaoImpl)ctx.getBean("name3");
		
		System.out.println("Full Name is  " +impl1.fullName());
		System.out.println("Full Name is  " +impl2.fullName());
		System.out.println("Full Name is  " +impl3.fullName());
	}
}
