package com.hexaware.conex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/conex/instructor.xml");
		Instructor instr = (Instructor)ctx.getBean("ins1");
		instr.showInfo();
	}
}
