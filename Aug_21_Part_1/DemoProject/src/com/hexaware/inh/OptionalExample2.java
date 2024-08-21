package com.hexaware.inh;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalExample2 {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Stuti", "Java", "Programmer", 99234.33));
		employList.add(new Employ(2, "Venkatesh", "Dotnet", "Manager", 77999.33));
		employList.add(new Employ(3, "Malar", "Sql", "Expert", 88844.33));
		employList.add(new Employ(4, "Jahnavi", "Java", "Programmer", 91134.33));
		employList.add(new Employ(5, "Soumya", "Dotnet", "Tester", 98811.33));
		employList.add(new Employ(6, "Sabari", "React", "Expert", 87742.33));
	}
	
	public List<Employ> showEmp() {
        return employList;
    }

    public Employ searchEmp(int empno) {
        Employ empFound = null;
        for(Employ e : employList) {
            if (e.getEmpno()==empno) {
                empFound=e;
            }
        }
        return empFound;
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		int empno = sc.nextInt();
		OptionalExample2 obj = new OptionalExample2();
		Optional<Employ> employFound = Optional.ofNullable(obj.searchEmp(empno));
		if (employFound.isPresent()) {
			System.out.println(employFound);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	}
}
