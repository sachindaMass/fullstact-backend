package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseBusinessCategory {

	@Id
	@GeneratedValue
	private Long Id;

	@Column(columnDefinition = "TEXT")
	private String businessCategory;

	public CourseBusinessCategory() {
	}

	public CourseBusinessCategory(Long id, String businessCategory) {
		super();
		Id = id;
		this.businessCategory = businessCategory;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getBusinessCategory() {
		return businessCategory;
	}

	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	
	

}
