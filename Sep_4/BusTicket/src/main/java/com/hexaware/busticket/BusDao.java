package com.hexaware.busticket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;



public class BusDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Buses> showBusesDao() {
		String cmd = "select * from Buses";
		List<Buses> busList = jdbcTemplate.query(cmd, new RowMapper<Buses>() {

			@Override
			public Buses mapRow(ResultSet rs, int rowNum) throws SQLException {
				Buses bus = new Buses();
				bus.setBusId(rs.getInt("bus_Id"));
				bus.setBusNumber(rs.getString("bus_Number"));
				bus.setBusType(rs.getString("bus_Type"));
				bus.setBusOperatorId(rs.getInt("bus_Operator_Id"));
				bus.setSeatCapacity(rs.getInt("seat_Capacity"));
				bus.setAvailableSeats(rs.getInt("available_Seats"));
				// TODO Auto-generated method stub
				return bus;
			}
		});
		
		return busList;
		
}
}