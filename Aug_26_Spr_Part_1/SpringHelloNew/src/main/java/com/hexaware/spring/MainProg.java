package com.hexaware.spring;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/spring/hello.xml");
		HelloImpl impl = null;
		Date date = new Date();
		int hr = date.getHours();
		if (hr < 12) {
			impl = (HelloImpl)ctx.getBean("bean1");
		} else if (hr >= 12 && hr < 16) {
			impl = (HelloImpl)ctx.getBean("bean2");
		} else if (hr >= 16) {
			impl = (HelloImpl)ctx.getBean("bean3");
		}
		
		System.out.println(impl.sayHello("Prasanna"));
	}
}
