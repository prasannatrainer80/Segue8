package com.hexaware.jdk8;

@FunctionalInterface
interface ICalculation {
	int calculate(int a, int b);
}

class Calculation {
	int sum(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	int mult(int a, int b) {
		return a*b;
	}
}
public class MethodRefEx1 {

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		ICalculation ical = calculation::sum;
		System.out.println("Sum is   " +ical.calculate(12, 5));
		ical = calculation::sub;
		System.out.println("Sub is  " +ical.calculate(12, 5));
		ical = calculation::mult;
		System.out.println("Mult is  " +ical.calculate(12, 5));
	}
	
}
