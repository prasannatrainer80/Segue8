package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/")
	public String sayHello() {
		return "Welcome to Spring Boot...";
	}
	
	@RequestMapping(value="/stuti")
	public String stuti() {
		return "Hi I am Stuti Singh...";
	}
	
	@RequestMapping(value="/balaji")
	public String balaji() {
		return "Hi I am Balaji Sabari...";
	}
}
