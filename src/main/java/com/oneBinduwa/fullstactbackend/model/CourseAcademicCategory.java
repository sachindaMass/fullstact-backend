package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseAcademicCategory {

	@Id
	@GeneratedValue
	private Long id;

	@Column(columnDefinition = "TEXT")
	private String academicCategory;

	public CourseAcademicCategory() {
	}

	public CourseAcademicCategory(Long id, String academicCategory) {
		super();
		this.id = id;
		this.academicCategory = academicCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAcademicCategory() {
		return academicCategory;
	}

	public void setAcademicCategory(String academicCategory) {
		this.academicCategory = academicCategory;
	}

}
