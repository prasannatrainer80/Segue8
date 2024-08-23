package com.hexaware.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.bank.dao.BankDao;
import com.hexaware.bank.dao.BankDaoImpl;

public class AddUserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user, pwd;
		System.out.println("Enter UserName  ");
		user = sc.next();
		System.out.println("Enter Password  ");
		pwd = sc.next();
		BankDaoImpl dao = new BankDaoImpl();
		try {
			System.out.println(dao.createUser(user, pwd));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
