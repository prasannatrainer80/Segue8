package com.hexaware.inh;

class C1 {
	C1() {
		System.out.println("Base Class Constructor...");
	}
}

class C2 extends C1 {
	C2() {
		System.out.println("Derived Class Constructor...");
	}
}

public class Inhc {
	public static void main(String[] args) {
		new C2();
	}
}
