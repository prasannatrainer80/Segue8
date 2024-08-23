package com.hexaware.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.hexaware.bank.dao.BankDao;
import com.hexaware.bank.dao.BankDaoImpl;
import com.hexaware.bank.model.Bank;

public class SearchAccountMain {

	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No   ");
		accountNo = sc.nextInt();
		BankDao dao = new BankDaoImpl();
		try {
			Bank bank = dao.searchAccountDao(accountNo);
			if (bank!=null) {
				System.out.println(bank);
			} else {
				System.out.println("Invalid Account No...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
