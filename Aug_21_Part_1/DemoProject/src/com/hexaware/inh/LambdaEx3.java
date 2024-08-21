package com.hexaware.inh;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx3 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Stuti", "Java", "Programmer", 99234.33));
		employList.add(new Employ(2, "Venkatesh", "Dotnet", "Manager", 77999.33));
		employList.add(new Employ(3, "Malar", "Sql", "Expert", 88844.33));
		employList.add(new Employ(4, "Jahnavi", "Java", "Programmer", 99234.33));
		employList.add(new Employ(5, "Soumya", "Dotnet", "Tester", 98811.33));
		employList.add(new Employ(6, "Sabari", "React", "Expert", 87742.33));
		
//		for (Employ x : employList) {
//			System.out.println(x);
//		}
		System.out.println("Employ List is  ");
		employList.forEach(x -> {
			System.out.println(x);
		});
	}
}
