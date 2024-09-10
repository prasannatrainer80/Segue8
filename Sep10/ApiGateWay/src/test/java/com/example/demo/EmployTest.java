package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployTest {

	@Test
	void testConstructor() {
		Employ employ = new Employ(1, "abc", 9942.22);
		assertEquals(1, employ.getEmpno());
		assertEquals("abc", employ.getName());
		assertEquals(9942.22, employ.getBasic(),2);
	}

}
