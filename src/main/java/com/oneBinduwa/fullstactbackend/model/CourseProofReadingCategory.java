package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseProofReadingCategory {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String proofReadingCategory;
	
	public CourseProofReadingCategory() {}

	public CourseProofReadingCategory(Long id, String proofReadingCategory) {
		super();
		this.id = id;
		this.proofReadingCategory = proofReadingCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProofReadingCategory() {
		return proofReadingCategory;
	}

	public void setProofReadingCategory(String proofReadingCategory) {
		this.proofReadingCategory = proofReadingCategory;
	}
	
	
	
	
	
	

}
