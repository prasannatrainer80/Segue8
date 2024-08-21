package com.hexaware.jdk8;

interface IData {
	default void company() {
		System.out.println("Company is Hexaware...");
	}
	void name();
	void email();
}

class Malar implements IData {

	@Override
	public void name() {
		System.out.println("Name is Malar...");
	}

	@Override
	public void email() {
		System.out.println("Email is malar@gmail.com");
	}
	
}

class Ragu implements IData {

	@Override
	public void name() {
		System.out.println("Name is Ragu...");
	}

	@Override
	public void email() {
		System.out.println("Email is ragu@gmail.com");
	}
	
}
public class Test {
	public static void main(String[] args) {
		IData[] arr = new IData[] {
			new Ragu(), new Malar()	
		};
		for (IData iData : arr) {
			iData.company();
			iData.name();
			iData.email();
		}
	}
}
