package com.hexaware.inh;

interface IDemo {
	void greetMe();
}

//class D1 implements IDemo {
//
//	@Override
//	public void greetMe() {
//		System.out.println("Good Morning...");
//	}
//	
//}

public class LambdaEx1 {

	public static void main(String[] args) {
		IDemo obj1 = () -> {
			System.out.println("Good Morning...");
		};
		obj1.greetMe();
		
		IDemo obj2 = () -> {
			System.out.println("Good Afternoon...");
		};
		
		obj2.greetMe();
		
		IDemo obj3 = () -> {
			System.out.println("Good Evening...");
		};
		
		obj3.greetMe();
	}
}
