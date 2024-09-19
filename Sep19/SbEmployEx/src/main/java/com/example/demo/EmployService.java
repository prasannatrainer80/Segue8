package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployService {

	@Autowired
	private EmployRepository repo;
	
	public List<Employ> showEmploy() {
		return repo.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return repo.findById(empno).get();
	}
	
	public String addEmploy(Employ employ) {
		repo.save(employ);
		return "Employ Record Inserted...";
	}
	
	public String updateEmploy(Employ employ) {
		repo.save(employ);
		return "Employ Record Updated...";
	}
	
	public String deleteEmploy(int id) {
		Employ employFound = repo.findById(id).get();
		repo.delete(employFound);
		return "Employ Record Deleted...";
	}
}
