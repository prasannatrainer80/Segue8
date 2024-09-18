package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployController {

	@Autowired
	private EmployService service;
	
	@GetMapping(value="/showEmploy")
	public List<Employ> showEmploy() {
		return service.showEmploy();
	}
	
	@GetMapping(value="/searchEmploy/{empno}")
	public Employ searchEmploy(@PathVariable int empno) {
		return service.searchEmploy(empno);
	}
}
