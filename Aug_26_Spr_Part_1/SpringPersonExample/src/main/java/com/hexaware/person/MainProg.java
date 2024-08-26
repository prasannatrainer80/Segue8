package com.hexaware.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/person/person.xml");
		Person person1 = (Person)ctx.getBean("beanPerson1");
		Person person2 = (Person)ctx.getBean("beanPerson2");
		Person person3 = (Person)ctx.getBean("beanPerson3");
		person1.showAll();
		person2.showAll();
		person3.showAll();
	}
}
