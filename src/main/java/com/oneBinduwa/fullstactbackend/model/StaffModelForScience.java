package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StaffModelForScience {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String scienceHeading;
	
	@Column(columnDefinition = "TEXT")
	private String scienceContent;

	@Column(columnDefinition = "TEXT")
	private String scienceContentTwo;
	
	public StaffModelForScience() {
		
	}

	public StaffModelForScience(Long id, String scienceHeading, String scienceContent, String scienceContentTwo) {
		super();
		this.id = id;
		this.scienceHeading = scienceHeading;
		this.scienceContent = scienceContent;
		this.scienceContentTwo = scienceContentTwo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScienceHeading() {
		return scienceHeading;
	}

	public void setScienceHeading(String scienceHeading) {
		this.scienceHeading = scienceHeading;
	}

	public String getScienceContent() {
		return scienceContent;
	}

	public void setScienceContent(String scienceContent) {
		this.scienceContent = scienceContent;
	}

	public String getScienceContentTwo() {
		return scienceContentTwo;
	}

	public void setScienceContentTwo(String scienceContentTwo) {
		this.scienceContentTwo = scienceContentTwo;
	}
	
	
	
	
	
	
	

}
