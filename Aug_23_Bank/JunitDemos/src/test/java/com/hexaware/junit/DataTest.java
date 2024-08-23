package com.hexaware.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void testNull() {
		Data data = null;
		assertNull(data);
		data = new Data();
		assertNotNull(data);
	}
	
	@Test
	public void testEvenOdd() {
		Data data = new Data();
		assertTrue(data.evenOdd(2));
		assertFalse(data.evenOdd(1));
	}
	
	@Test
	public void testMax3() {
		Data data = new Data();
		assertEquals(12, data.max3(12, 5, 8));
		assertEquals(12, data.max3(5, 12, 8));
		assertEquals(12, data.max3(5, 8, 12));
	}
	
	@Test
	public void testSayHello() {
		Data data  = new Data();
		assertEquals("Welcome to Java Training...", data.sayHello());
	}

	@Test
	public void testSum() {
		Data data = new Data();
		assertEquals(5, data.sum(2, 3));
	}
	
	@Test
	public void testFact() {
		Data data = new Data();
		assertEquals(6, data.fact(3));
	}
}
