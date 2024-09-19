package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int login(String user, String pwd) {
		String cmd = "select count(*) cnt from Login Where UserName = ? AND PassCode = ?";
		List<Object> list = jdbcTemplate.query(cmd, new Object[] {user, pwd},new RowMapper<Object>() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Object ob = rs.getInt("cnt");
				return ob;
			}
		});
		Integer str = (Integer)list.get(0);
		System.out.println("count is " +str);
		return str;
	}
}
