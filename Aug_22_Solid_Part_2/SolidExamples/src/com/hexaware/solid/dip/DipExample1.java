package com.hexaware.solid.dip;


class JavaTrainerInfo {
	public void trainerName() {
		System.out.println("Trainer Name is Prasanna...");
	}
	
	public void city() {
		System.out.println("Location is from Hyderabad...");
	}
	
}

class DotnetTrainerInfo {
	public void trainerName() {
		System.out.println("Trainer name is Santosh...");
	}
	public void city() {
		System.out.println("City is From Chennai...");
	}
}

class DotnetTrainerInformation {
	private DotnetTrainerInfo trainerInfo;
	
	public DotnetTrainerInformation(DotnetTrainerInfo trainerInfo) {
		this.trainerInfo = trainerInfo;
	}
	
	public void showDotnetInfo() {
		trainerInfo.trainerName();
		trainerInfo.city();
	}
}


class JavaTrainerInformation {
	private JavaTrainerInfo trainerInfo;
	
	public JavaTrainerInformation(JavaTrainerInfo trainerInfo) {
		this.trainerInfo = trainerInfo;
	}
	
	public void details() {
		trainerInfo.trainerName();
		trainerInfo.city();
	}
}

public class DipExample1 {
	public static void main(String[] args) {
		JavaTrainerInformation info = new JavaTrainerInformation(new JavaTrainerInfo());
		info.details();
		
		DotnetTrainerInformation info1 = new DotnetTrainerInformation(new DotnetTrainerInfo());
		info1.showDotnetInfo();
	}
}
