package com.hexaware.solid;

class JavaTraining {
	public void show() {
		System.out.println("Its Java 8 training going on for hexaware...");
	}
	
	public void timing() {
		System.out.println("Its from Morning 9 to 6 online class...");
	}
}

class DotnetTraining {
	public void show() {
		System.out.println("Its Dotnet Training for Hexaware...");
	}
	
	public void timing() {
		System.out.println("Its from Morning 9 to 6 Hybrid Mode...");
	}
}

class SapTraining {
	public void show() {
		System.out.println("Its About to Start not decided...");
	}
	
	public void timing() {
		System.out.println("Mostly 4 hrs Online Mode...");
	}
}
public class OpenClosed {

	public void showInfo(Object ob) {
		if (ob instanceof JavaTraining) {
			JavaTraining obj = (JavaTraining)ob;
			obj.show();
			obj.timing();
		}
		if (ob instanceof DotnetTraining) {
			DotnetTraining obj = (DotnetTraining)ob;
			obj.show();
			obj.timing();
		}
		if (ob instanceof SapTraining) {
			SapTraining obj = (SapTraining)ob;
			obj.show();
			obj.timing();
		}
	}
	
	public static void main(String[] args) {
		JavaTraining javatraining = new JavaTraining();
		OpenClosed obj = new OpenClosed();
		obj.showInfo(javatraining);
	}
}
