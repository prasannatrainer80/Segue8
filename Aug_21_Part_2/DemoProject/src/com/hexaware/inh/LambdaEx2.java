package com.hexaware.inh;

@FunctionalInterface
interface ICalc {
	int calc(int a, int b);
}

//class Sum implements ICalc {
//
//	@Override
//	public int calc(int a, int b) {
//		// TODO Auto-generated method stub
//		return a+b;
//	}
//	
//}
public class LambdaEx2 {

	public static void main(String[] args) {
		ICalc obj1 = (a, b) -> {
			return a+b;
		};
		System.out.println("Sum is  " +obj1.calc(12, 5));
		
		ICalc obj2 = (a,b) -> {
			return a-b;
		};
		
		System.out.println("Sub is  " +obj2.calc(12, 5));
		
		ICalc obj3 = (a,b) -> {
			return a*b;
		};
		System.out.println("Mult is  " +obj3.calc(12, 5));
	}
}
