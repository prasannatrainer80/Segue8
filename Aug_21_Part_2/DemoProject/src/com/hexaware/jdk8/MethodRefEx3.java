package com.hexaware.jdk8;

interface ITest {
	Employ showEmploy(int empno, String name, double basic);
}


public class MethodRefEx3 {

	public static void main(String[] args) {
		ITest obj = Employ::new;
		System.out.println(obj.showEmploy(1, "Raguram", 99423));
	}
}
