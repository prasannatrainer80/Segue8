package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PaginationService {

	@Autowired
	private PaginationRepository pageRepo;
	
	public org.springframework.data.domain.Page<Employ> findAll(int pageNo, int pageSize, String sortBy, String sortDirection) {
		Sort sort = Sort.by(Sort.Direction.fromString(sortDirection),sortBy);
		Pageable pageable = PageRequest.of(pageNo, pageSize,sort);
		return pageRepo.findAll(pageable);
	}
}
