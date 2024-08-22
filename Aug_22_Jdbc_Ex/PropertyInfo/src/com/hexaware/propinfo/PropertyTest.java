package com.hexaware.propinfo;

import java.util.Date;
import java.util.ResourceBundle;

public class PropertyTest {

	ResourceBundle rb =ResourceBundle.getBundle("info");
	
	public void showInfo() {
		System.out.println(rb.getString("company"));
		System.out.println(rb.getString("trainer"));
		Date date = new Date();
		int hr = date.getHours();
		if (hr < 12) {
			System.out.println(rb.getString("greet1"));
		} else if (hr >=12 && hr <= 16) {
			System.out.println(rb.getString("greet2"));
		} else if (hr > 16) {
			System.out.println(rb.getString("greet3"));
		}
	}
	
	public void endNotes() {
		System.out.println(rb.getString("endNote"));
		
	}
	
	public static void main(String[] args) {
		PropertyTest test = new PropertyTest();
		test.showInfo();
		test.endNotes();
	}
}
