package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployService {

	@Autowired
	private EmployRepository repo;
	
	public List<Employ> showAll() {
		return repo.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return repo.findById(empno).get();
	}
}
