package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

	@Autowired
	private WalletRepository walletRepo;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Wallet searchByWallet(int cid, String walletName) {
		String cmd = "select * from Wallet where CUS_ID = ? AND WAL_SOURCE = ?";
		List<Wallet> walletInfo = jdbcTemplate.query(cmd, new Object[] {cid,walletName}, new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setWalletId(rs.getInt("WAL_ID"));
				wallet.setCustId(rs.getInt("CUS_ID"));
				wallet.setWalSource(rs.getString("WAL_SOURCE"));
				wallet.setWalAmount(rs.getDouble("WAL_AMOUNT"));
				return wallet;
			}
		});
		return walletInfo.get(0);
	}
	public List<Wallet> showWalletByCustomerId(int cid) {
		String cmd = "select * from Wallet Where CUS_ID = ?";
		List<Wallet> walletList =  jdbcTemplate.query(cmd, new Object[] {cid}, new RowMapper<Wallet>() {

			@Override
			public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
				Wallet wallet = new Wallet();
				wallet.setWalletId(rs.getInt("WAL_ID"));
				wallet.setCustId(rs.getInt("CUS_ID"));
				wallet.setWalSource(rs.getString("WAL_SOURCE"));
				wallet.setWalAmount(rs.getDouble("WAL_AMOUNT"));
				return wallet;
			}
		});
		return walletList;
	}
}
