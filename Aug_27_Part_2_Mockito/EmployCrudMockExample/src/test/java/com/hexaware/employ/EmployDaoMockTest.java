package com.hexaware.employ;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hexaware.dao.EmployDao;
import com.hexaware.model.Employ;

public class EmployDaoMockTest {

	@Mock
	EmployDao employDaoMock;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testSearchByIdDao() throws ClassNotFoundException, SQLException {
		 Optional<Employ> e1 =  Optional.of(new Employ(1, "Raj", "MALE","Java", "Prgrammer", 84234));
		 Employ e2 =  new Employ(2, "Raj", "MALE","Java", "Prgrammer", 84234);
		 Employ e3 = null;
		 when(employDaoMock.searchEmployDao(-1)).thenReturn(null);
		 when(employDaoMock.searchEmployDao(1)).thenReturn(e1);
		 assertNull(employDaoMock.searchEmployDao(-1));
		 assertEquals(e1, employDaoMock.searchEmployDao(1));
	}
	
	@Test
	public void testShowEmployDao() throws ClassNotFoundException, SQLException {
		  List<Employ> employList = Arrays.asList(
				  new Employ(1, "Raj", "MALE","Java", "Prgrammer", 84234),
				  new Employ(2, "Balaji", "MALE","Java", "Prgrammer", 84234),
				  new Employ(3, "Jahnavi", "FEMALE","Java", "Prgrammer", 84234)
				  );
		  when(employDaoMock.showEmployDao()).thenReturn(employList);
		  assertEquals(3, employList.size());
		  
	}
}
