package com.hexaware.junit;

public class Data {

	public boolean evenOdd(int n) {
		if (n%2==0) {
			return true;
		}
		return false;
	}
	
	public int max3(int a, int b, int c) {
		int m = a;
		if (m < b) {
			m  = b;
		}
		if (m < c) {
			m = c;
		}
		return m;
	}
	public String sayHello() {
		return "Welcome to Java Training...";
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int fact(int n) {
		int f = 1;
		for(int i=1;i<=n;i++) {
			f = f*i;
		}
		return f;
	}
}
