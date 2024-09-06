package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.InternalServerErrorException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Tutorial;
import com.example.demo.repo.TutorialRepository;

@RestController
@RequestMapping("/api")
public class TutorialController {

	@Autowired
	private TutorialRepository repo;
	
	@GetMapping(value="/showTutorial")
	public List<Tutorial> getAllTutorials() {
		return repo.findAll();
	}
	
	@PostMapping(value="/addTutorial")
	public String addTutorial(@RequestBody Tutorial tutorial) {
		long id = tutorial.getId();
		String str="";
		str+=id;
		int x = Integer.parseInt(str);
		Tutorial tutorialFound = repo.findById(x).orElse(null);
		if (tutorialFound!=null) {
			throw new InternalServerErrorException("Alreay Tutorail Exists with Id " +x);
		} else {
			repo.save(tutorial);
			return "Tutorial Added...";
		}
	}
	@GetMapping(value="/searchTutorial/{id}")
	public ResponseEntity<Tutorial> searchById(@PathVariable int id) {
		 Tutorial tutorial = repo.findById(id)
			        .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

			    return new ResponseEntity<>(tutorial, HttpStatus.OK);
	}
}
