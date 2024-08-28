package com.hexaware.hib;

import java.util.Scanner;

public class AddUserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserData userData = new UserData();
		EmployDao dao = new EmployDaoImpl();
		System.out.println("Enter Username and Password  ");
		userData.setUserName(sc.next());
		userData.setPassCode(sc.next());
		System.out.println(dao.addUser(userData));
		
	}
}
