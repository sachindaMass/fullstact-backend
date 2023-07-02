package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StaffModelForBiology {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String bioHeading;
	
	@Column(columnDefinition = "TEXT")
	private String bioContent;
	
	@Column(columnDefinition = "TEXT")
	private String bioContentTwo;
	
	public StaffModelForBiology() {
		
	}

	public StaffModelForBiology(Long id, String bioHeading, String bioContent, String bioContentTwo) {
		super();
		this.id = id;
		this.bioHeading = bioHeading;
		this.bioContent = bioContent;
		this.bioContentTwo = bioContentTwo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBioHeading() {
		return bioHeading;
	}

	public void setBioHeading(String bioHeading) {
		this.bioHeading = bioHeading;
	}

	public String getBioContent() {
		return bioContent;
	}

	public void setBioContent(String bioContent) {
		this.bioContent = bioContent;
	}

	public String getBioContentTwo() {
		return bioContentTwo;
	}

	public void setBioContentTwo(String bioContentTwo) {
		this.bioContentTwo = bioContentTwo;
	}
	
	

	
	
	
	
	
	

}
