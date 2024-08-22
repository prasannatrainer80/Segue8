package com.hexaware.solid.isp;

interface IEmployDetails {
	void name();
	void paymentDetails();
}

interface IAccontDetails {
	void pfDetails();
	void paySlips();
}

class Stuti implements IEmployDetails {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paymentDetails() {
		// TODO Auto-generated method stub
		
	}
	
}
class Balaji implements IEmployDetails, IAccontDetails {

	@Override
	public void pfDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paySlips() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paymentDetails() {
		// TODO Auto-generated method stub
		
	}
	
}
public class IspSolution {

}
