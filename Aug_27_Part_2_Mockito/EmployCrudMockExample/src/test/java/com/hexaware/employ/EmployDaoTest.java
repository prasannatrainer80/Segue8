package com.hexaware.employ;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import com.hexaware.dao.EmployDao;
import com.hexaware.dao.EmployDaoImpl;
import com.hexaware.model.Employ;

public class EmployDaoTest {

	EmployDao employDaoMock;
	
	@Before
	public void setUp() {
		employDaoMock = new EmployDaoImpl();
	}
	
	@Test
	public void testShowEmployDao() throws ClassNotFoundException, SQLException {
		List<Employ> employList = employDaoMock.showEmployDao();
		assertEquals(9, employList.size());
	}
	
}
