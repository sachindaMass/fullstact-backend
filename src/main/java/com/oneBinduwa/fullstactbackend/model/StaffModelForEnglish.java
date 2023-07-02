package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StaffModelForEnglish {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String englishHeading;
	
	@Column(columnDefinition = "TEXT")
	private String englishContent;

	@Column(columnDefinition = "TEXT")
	private String englishContentTwo;
	
	public StaffModelForEnglish() {}

	public StaffModelForEnglish(Long id, String englishHeading, String englishContent, String englishContentTwo) {
		super();
		this.id = id;
		this.englishHeading = englishHeading;
		this.englishContent = englishContent;
		this.englishContentTwo = englishContentTwo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnglishHeading() {
		return englishHeading;
	}

	public void setEnglishHeading(String englishHeading) {
		this.englishHeading = englishHeading;
	}

	public String getEnglishContent() {
		return englishContent;
	}

	public void setEnglishContent(String englishContent) {
		this.englishContent = englishContent;
	}

	public String getEnglishContentTwo() {
		return englishContentTwo;
	}

	public void setEnglishContentTwo(String englishContentTwo) {
		this.englishContentTwo = englishContentTwo;
	}
	
	
	
	
	
	

	
}
