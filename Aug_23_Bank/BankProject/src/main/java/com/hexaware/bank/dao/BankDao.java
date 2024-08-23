package com.hexaware.bank.dao;

import java.sql.SQLException;

import com.hexaware.bank.model.Bank;

public interface BankDao {

	String createAccountDao(Bank bank) throws ClassNotFoundException, SQLException;
	Bank searchAccountDao(int accountNo) throws SQLException, ClassNotFoundException;
	String closeAccountDao(int accountNo) throws ClassNotFoundException, SQLException;
	String depositAmountDao(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException;
	String withdrawAmountDao(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException;
}
