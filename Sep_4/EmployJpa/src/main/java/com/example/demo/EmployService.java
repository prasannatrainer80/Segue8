package com.example.demo;

import java.util.List;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	
	public void addEmploy(Employ employ) {
		repo.save(employ);
	}
	
	public org.springframework.data.domain.Page<Employ> findAll(int pageNo, int pageSize, String sortBy, String sortDirection) {
		Sort sort = Sort.by(Sort.Direction.fromString(sortDirection),sortBy);
		Pageable pageable = PageRequest.of(pageNo, pageSize,sort);
		return repo.findAll(pageable);
	}
	
	public void updateEmploy(Employ employ) {
		repo.save(employ);
	}
	
	public void deleteEmploy(int id) {
		repo.deleteById(id);
	}
}
