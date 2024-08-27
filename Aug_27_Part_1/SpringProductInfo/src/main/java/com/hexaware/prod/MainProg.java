package com.hexaware.prod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/prod/product.xml");
		OrderLogic logic = (OrderLogic)ctx.getBean("orderLogic");
		logic.displayInfo();
	}
}
