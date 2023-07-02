package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseEnglishCategory {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String englishCategory;
	
	public CourseEnglishCategory() {}

	public CourseEnglishCategory(Long id, String englishCategory) {
		super();
		this.id = id;
		this.englishCategory = englishCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnglishCategory() {
		return englishCategory;
	}

	public void setEnglishCategory(String englishCategory) {
		this.englishCategory = englishCategory;
	}
	
	
	
	

}
