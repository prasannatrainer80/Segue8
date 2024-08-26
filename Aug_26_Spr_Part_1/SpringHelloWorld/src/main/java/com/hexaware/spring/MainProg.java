package com.hexaware.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/spring/hello.xml");
		HelloImpl impl = (HelloImpl)ctx.getBean("bean1");
		System.out.println(impl.sayHello("Roushan"));
	}
}
