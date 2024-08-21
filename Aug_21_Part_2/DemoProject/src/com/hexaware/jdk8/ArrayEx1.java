package com.hexaware.jdk8;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] a = new int[] {12,5};
		try {
			a[10] = 55;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array Size is Small...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
