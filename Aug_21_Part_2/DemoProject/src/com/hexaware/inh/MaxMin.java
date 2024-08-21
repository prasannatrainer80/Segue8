package com.hexaware.inh;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Stuti", "Java", "Programmer", 99234.33));
		employList.add(new Employ(2, "Venkatesh", "Dotnet", "Manager", 77999.33));
		employList.add(new Employ(3, "Malar", "Sql", "Expert", 88844.33));
		employList.add(new Employ(4, "Jahnavi", "Java", "Programmer", 91134.33));
		employList.add(new Employ(5, "Soumya", "Dotnet", "Tester", 98811.33));
		employList.add(new Employ(6, "Sabari", "React", "Expert", 87742.33));
		
		System.out.println("Employ who is getting max salary  ");
		Employ employ1 = employList.stream().max((m1,m2) -> 
		m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println(employ1);
		
		Employ employ2 = employList.stream().min((m1,m2) -> 
		m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println("Employ who is getting min salary  ");
		System.out.println(employ2);
	}
}
