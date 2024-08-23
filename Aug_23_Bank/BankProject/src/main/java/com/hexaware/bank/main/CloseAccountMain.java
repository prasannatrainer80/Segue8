package com.hexaware.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.bank.dao.BankDao;
import com.hexaware.bank.dao.BankDaoImpl;

public class CloseAccountMain {

	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No to Close  ");
		accountNo = sc.nextInt();
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.closeAccountDao(accountNo));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
