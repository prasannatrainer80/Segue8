package com.hexaware.solid.dip;

interface ITrainerData {
	void name();
	void city();
	void email();
}

public class DipExampleSolution {
	public static void main(String[] args) {
		ITrainerData trainer1 = new JavaInfo();
		ITrainerData trainer2 = new DotnetInfo();
		
		TrainerUtil utility1 = new TrainerUtil(trainer1);
		utility1.showTrainerInfo();
		
		TrainerUtil utility2 = new TrainerUtil(trainer2);
		utility2.showTrainerInfo();
	}
}


class TrainerUtil {
	private ITrainerData itrainerData;
	
	public TrainerUtil(ITrainerData itrainerData) {
		this.itrainerData = itrainerData;
	}
	
	public void showTrainerInfo() {
		itrainerData.name();
		itrainerData.city();
		itrainerData.email();
	}
}
class JavaInfo implements ITrainerData {

	@Override
	public void name() {
		System.out.println("Name is Prasanna...");
	}

	@Override
	public void city() {
		System.out.println("City is Hyderabad");
	}

	@Override
	public void email() {
		System.out.println("Email is prasanna.trainer@gmail.com");
	}
	
}

class DotnetInfo implements ITrainerData {

	@Override
	public void name() {
		System.out.println("Dotnet Trainer is Santosh...");
	}

	@Override
	public void city() {
		System.out.println("City is from Chennai...");
		
	}

	@Override
	public void email() {
		System.out.println("Email is santosh@gmail.com");		
	}
	
}
