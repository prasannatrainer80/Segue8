package com.hexaware.solid.lsp;

abstract class Details {
	abstract void showInfo();
}

class Shweta extends Details {

	@Override
	void showInfo() {
		System.out.println("Hi I am Shweta Tiwari from Hexaware Segue...");
	}
	
}

class Sabari extends Details {

	@Override
	void showInfo() {
		System.out.println("Hi I am Sabari Balaji from Hexaware Segue...");		
	}
	
}

class Ragu extends Details {

	@Override
	void showInfo() {
		System.out.println("Hi I am Ragu from Hexaware Segue...");
	}
	
}
public class LiscovExample {
	public static void main(String[] args) {
		Details details1 = new Shweta();
		Details details2 = new Sabari();
		Details details3 = new Ragu();
		
		details1.showInfo();
		details2.showInfo();
		details3.showInfo();
	}
}
