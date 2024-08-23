package com.hexaware.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.bank.model.Bank;
import com.hexaware.bank.util.ConnectionUtil;
import com.mysql.cj.conf.ConnectionUrl;

public class BankDaoImpl implements BankDao {

	Connection connection;
	PreparedStatement preparedStatement;
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		String cmd = "select case when max(accountNo) IS NULL THEN 1 else max(accountNo)+1 "
				+ "end accno from bank";
		connection = ConnectionUtil.getConnection();
		preparedStatement = connection.prepareStatement(cmd);
		ResultSet rs = preparedStatement.executeQuery();
		rs.next();
		int accno =rs.getInt("accno");
		return accno;
	}
	@Override
	public String createAccountDao(Bank bank) throws ClassNotFoundException, SQLException {
		int accno = generateAccountNo();
		bank.setAccountNo(accno);
		String cmd = "Insert into Bank(AccountNo,FirstName,LastName,City,State,"
				+ "Amount, CheqFacil,AccountType) values(?,?,?,?,?,?,?,?)";
		preparedStatement = connection.prepareStatement(cmd);
		preparedStatement.setInt(1, accno);
		preparedStatement.setString(2, bank.getFirstName());
		preparedStatement.setString(3, bank.getLastName());
		preparedStatement.setString(4, bank.getCity());
		preparedStatement.setString(5, bank.getState());
		preparedStatement.setDouble(6, bank.getAmount());
		preparedStatement.setString(7, bank.getCheqFacil());
		preparedStatement.setString(8, bank.getAccountType());
		preparedStatement.executeUpdate();
		return "Account Created with Account No " +accno;
	}
	@Override
	public Bank searchAccountDao(int accountNo) throws SQLException, ClassNotFoundException {
		Bank bank = null;
		connection = ConnectionUtil.getConnection();
		String cmd = "select * from Bank where AccountNo = ?";
		preparedStatement = connection.prepareStatement(cmd);
		preparedStatement.setInt(1, accountNo);
		ResultSet rs = preparedStatement.executeQuery();
		if (rs.next()) {
			bank = new Bank();
			bank.setAccountNo(accountNo);
			bank.setFirstName(rs.getString("firstName"));
			bank.setLastName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getDouble("amount"));
			bank.setCheqFacil(rs.getString("cheqFacil"));
			bank.setAccountType(rs.getString("accountType"));
			return bank;
		}
		return bank;
	}
	@Override
	public String closeAccountDao(int accountNo) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccountDao(accountNo);
		if (bank!=null) {
			connection = ConnectionUtil.getConnection();
			String cmd = "update bank set status='inactive' where accountno=?";
			preparedStatement = connection.prepareStatement(cmd);
			preparedStatement.setInt(1, accountNo);
			preparedStatement.executeUpdate();
			return "Account Closed...";
		}
		return "Account No Not Found...";
	
	}
	@Override
	public String depositAmountDao(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccountDao(accountNo);
		if (bank!=null) {
			connection = ConnectionUtil.getConnection();
			String cmd = "Update Bank set Amount = Amount + ? Where AccountNo = ?";
			preparedStatement = connection.prepareStatement(cmd);
			preparedStatement.setDouble(1, depositAmount);
			preparedStatement.setInt(2, accountNo);
			preparedStatement.executeUpdate();
			cmd = "Insert into Trans(AccountNo,TransAmount,TransType) values(?,?,?)";
			preparedStatement = connection.prepareStatement(cmd);
			preparedStatement.setInt(1, accountNo);
			preparedStatement.setDouble(2, depositAmount);
			preparedStatement.setString(3, "C");
			preparedStatement.executeUpdate();
			return "Amount Credited to your Account...";
		}
		return "Account No Not Found...";
	}
	@Override
	public String withdrawAmountDao(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccountDao(accountNo);
		if (bank!=null) {
			double balance = bank.getAmount();
			connection = ConnectionUtil.getConnection();
			if (balance-withdrawAmount >= 0) {
				connection = ConnectionUtil.getConnection();
				String cmd = "Update Bank set Amount = Amount - ? Where AccountNo = ?";
				preparedStatement = connection.prepareStatement(cmd);
				preparedStatement.setDouble(1, withdrawAmount);
				preparedStatement.setInt(2, accountNo);
				preparedStatement.executeUpdate();
				cmd = "Insert into Trans(AccountNo,TransAmount,TransType) values(?,?,?)";
				preparedStatement = connection.prepareStatement(cmd);
				preparedStatement.setInt(1, accountNo);
				preparedStatement.setDouble(2, withdrawAmount);
				preparedStatement.setString(3, "D");
				preparedStatement.executeUpdate();
				return "Amount Debited from your Account...";
			} else {
				return "Insufficient Funds...";
			}
		}
		return "Account No Not Found..";
	}

}
