package com.hexaware.solid.lsp;

class First {
	public void show() {
		System.out.println("From Class First...");
	}
}

class Second extends First {
	public void show() {
		System.out.println("From Class Second...");
	}
}
public class LiscovSubPrinciple {
	public static void main(String[] args) {
		First obj = new Second();
		obj.show();
	}
}
