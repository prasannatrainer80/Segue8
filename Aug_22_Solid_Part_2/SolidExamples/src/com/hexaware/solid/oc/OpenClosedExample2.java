package com.hexaware.solid.oc;

interface IElectricityBilling {
	String billAmount(double billAmount);
}

class CreditCard implements IElectricityBilling {

	@Override
	public String billAmount(double billAmount) {
		return "Your Bill AMount is " +billAmount +" through payment CreditCard...";
	}
	
}
class PhonePe implements IElectricityBilling {

	@Override
	public String billAmount(double billAmount) {
		return "Your Bill AMount is " +billAmount +" through payment PhonePe...";
	}
	
}

class NetBanking implements IElectricityBilling {

	@Override
	public String billAmount(double billAmount) {
		return "Your Bill AMount is " +billAmount +" through payment NetBanking...";
	}
	
}


public class OpenClosedExample2 {
	
	public void showBillInfo(int meterId, String personName, IElectricityBilling billSource) {
		System.out.println("Meter Id " +meterId);
		System.out.println("Payment from Mr/Miss/Mrs " +personName);
		System.out.println("Paymode is  " +billSource.billAmount(1200));
	}
	
	public static void main(String[] args) {
		IElectricityBilling billSouce;
		
		OpenClosedExample2 obj = new OpenClosedExample2();
		
		billSouce = new NetBanking();
		obj.showBillInfo(6623, "Prasanna", billSouce);
		
		billSouce = new PhonePe();
		obj.showBillInfo(7773, "Soumya Mahajan",billSouce);
		
		billSouce = new CreditCard();
		obj.showBillInfo(8999, "Nivetha", billSouce);
	}
}
