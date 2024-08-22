package com.hexaware.propinfo;

import java.util.Date;

public class PropertyDemo {

	public void greetMe() {
		System.out.println("Company is Hexaware...");
		System.out.println("Trainer is Prasanna P");
		Date date = new Date();
		int hr = date.getHours();
		if (hr < 12) {
			System.out.println("Good Morning...");
		} else if (hr >=12 && hr <= 16) {
			System.out.println("Good Afternoon...");
		} else if (hr > 16) {
			System.out.println("Good Evening...");
		}
		
	}
	
	public void endNotes() {
		System.out.println("Bye for Today Next class we discuss more...");
	}
	
	public static void main(String[] args) {
		PropertyDemo demo = new PropertyDemo();
		demo.greetMe();
		demo.endNotes();
	}
}
