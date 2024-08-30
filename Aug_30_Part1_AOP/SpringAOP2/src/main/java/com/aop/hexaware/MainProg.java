package com.aop.hexaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/aop/aop.xml");
		SegueTraining segue = (SegueTraining)ctx.getBean("segue");
		segue.startTraining();
	}
}
