package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainNew {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/aop/aopnew.xml");
		SegueTraining st = (SegueTraining)ctx.getBean("beanSegue");
		st.startTraining();
		System.out.println(st.company());
		System.out.println(st.salary());
	}
}
