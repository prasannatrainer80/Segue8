package com.hexaware.solid.oc;

interface ITraining {
	void info();
	void timing();
}

class SapTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("It is in Pending Not Yet Decided");
	}

	@Override
	public void timing() {
		System.out.println("We will Update Soon...");
	}
	
}
class JavaTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("Java Training both online and offline started for hexaware");
	}

	@Override
	public void timing() {
		System.out.println("Batchs from 9 to 6 weekdays...");
	}
	
}

class DotnetTraining implements ITraining {

	@Override
	public void info() {
		System.out.println("Dotnet Training is Going on...from Hexaware August");
	}

	@Override
	public void timing() {
		System.out.println("Timing is from 9 to 6");
	}

}

public class OpenClosedExample {

	public void showInfo(ITraining training) {
		training.info();
		training.timing();
	}
	
	public static void main(String[] args) {
		JavaTraining jt = new JavaTraining();
		OpenClosedExample obj = new OpenClosedExample();
		obj.showInfo(jt);
		
		SapTraining st = new SapTraining();
		obj.showInfo(st);
	}
}
