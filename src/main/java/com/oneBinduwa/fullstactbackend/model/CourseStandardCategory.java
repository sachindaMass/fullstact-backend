package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseStandardCategory {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String standardCategory;
	
	public CourseStandardCategory() {}

	public CourseStandardCategory(Long id, String standardCategory) {
		super();
		this.id = id;
		this.standardCategory = standardCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStandardCategory() {
		return standardCategory;
	}

	public void setStandardCategory(String standardCategory) {
		this.standardCategory = standardCategory;
	}

	
	
}
