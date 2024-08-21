package com.hexaware.inh;

interface IHello {
	void sayHello();
}

public class LambdaExample1 {

	public static void main(String[] args) {
		IHello obj1 = () -> {
			System.out.println("Welcome to Lambda Expression...");
		};
		
		IHello obj2 = () -> {
			System.out.println("Hi We are from Hexaware Training...");
		};
		
		IHello obj3 = () -> {
			System.out.println("Hi This is for Segue Batch...");
		};
		
		obj1.sayHello();
		obj2.sayHello();
		obj3.sayHello();
	}
	
	
}
