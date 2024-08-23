package com.hexaware.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.bank.dao.BankDao;
import com.hexaware.bank.dao.BankDaoImpl;

public class DepositAccountMain {

	public static void main(String[] args) {
		int accountNo;
		double depositAmount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNo and Deposit Amount   ");
		accountNo = sc.nextInt();
		System.out.println("Enter Deposit Amount   ");
		depositAmount = sc.nextDouble();
		
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.depositAmountDao(accountNo, depositAmount));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
