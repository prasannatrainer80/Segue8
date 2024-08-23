package com.hexaware.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.bank.dao.BankDao;
import com.hexaware.bank.dao.BankDaoImpl;

public class WithdrawAccountMain {

	public static void main(String[] args) {
		int accountNo;
		double withdrawAmount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNo and Withdraw Amount   ");
		accountNo = sc.nextInt();
		System.out.println("Enter Withdraw Amount   ");
		withdrawAmount = sc.nextDouble();
		
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.withdrawAmountDao(accountNo, withdrawAmount));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
