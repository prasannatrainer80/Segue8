package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/calc")
public class CalcuationController {

	@RequestMapping(value="/sum/{a}/{b}")
	public String sum(@PathVariable int a, @PathVariable int b) {
		int c = a+b;
		String res="";
		res+=c;
		return res;
	}
	
	@RequestMapping(value="/sub/{a}/{b}")
	public String sub(@PathVariable int a, @PathVariable int b) {
		int c = a - b;
		String res="";
		res += c;
		return res;
	}
	
	@RequestMapping(value="/mult/{a}/{b}")
	public String mult(@PathVariable int a, @PathVariable int b) {
		int c = a * b;
		String res="";
		res += c;
		return res;
	}
}
