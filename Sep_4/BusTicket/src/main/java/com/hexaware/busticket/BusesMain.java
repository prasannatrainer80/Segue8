package com.hexaware.busticket;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class BusesMain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hexaware/busticket/busjdbc.xml");
		BusDao dao = (BusDao)ctx.getBean("busDao");
		System.out.println(dao);
		List<Buses> busList = dao.showBusesDao();
		for (Buses buses : busList) {
			System.out.println(buses);
		}
		
	}

}
