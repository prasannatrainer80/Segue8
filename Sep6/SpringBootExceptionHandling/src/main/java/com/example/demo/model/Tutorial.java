package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Tutorials")

public class Tutorial {


	  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
	  @Id
	  private long id;

	  @Column(name = "title")
	  private String title;

	  @Column(name = "description")
	  private String description;

	  @Column(name = "published")
	  private boolean published;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	  
}