package com.hexaware.inh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaFilterEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department  ");
		String dept = sc.next();
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Stuti", "Java", "Programmer", 99234.33));
		employList.add(new Employ(2, "Venkatesh", "Dotnet", "Manager", 77999.33));
		employList.add(new Employ(3, "Malar", "Sql", "Expert", 88844.33));
		employList.add(new Employ(4, "Jahnavi", "Java", "Programmer", 99234.33));
		employList.add(new Employ(5, "Soumya", "Dotnet", "Tester", 98811.33));
		employList.add(new Employ(6, "Sabari", "React", "Expert", 87742.33));
		
		employList.stream().filter(x -> x.getDept().equals(dept)).forEach(y -> {
			System.out.println(y);
		});
	}
}
