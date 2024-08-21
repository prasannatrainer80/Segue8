package com.hexaware.inh;

import java.util.Optional;

public class OptionalEx1 {

	public static void main(String[] args) {
		String[] str = new String[10];
		Optional<String> result = Optional.ofNullable(str[5]);
		if (result.isPresent()) {
			System.out.println(str[5]);
		} else {
			System.out.println("Value is Not Present...");
		}
	}
}
