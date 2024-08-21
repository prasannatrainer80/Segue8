package com.hexaware.inh;

public class MainProg {

	public static void main(String[] args) {
		IOne[] obj = new IOne[] {
			new Nivetha(),
			new Soumya(),
			new Venkatesh()
		};
		
		for (IOne iOne : obj) {
			iOne.name();
			iOne.email();
		}
	}
}
