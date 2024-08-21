package com.hexaware.jdk8;

import java.util.Date;

interface IGreeting {
	void greet();
}

class Welcome {
	void message1() {
		System.out.println("Good Morning...");
	}
	void message2() {
		System.out.println("Good Afternoon...");
	}
	void message3() {
		System.out.println("Good Evening...");
	}
}

public class MethodRefEx2 {

	public static void main(String[] args) {
		Date date = new Date();
		int hr = date.getHours();
//		System.out.println(hr);
		Welcome welcome = new Welcome();
		IGreeting greeting=null;
		if (hr <= 12) {
			greeting = welcome::message1;
		} else if (hr > 12 && hr <= 16) {
			greeting = welcome::message2;
		} else if (hr > 16 && hr < 20) {
			greeting = welcome::message3;
		}
		
		greeting.greet();
	}
}
