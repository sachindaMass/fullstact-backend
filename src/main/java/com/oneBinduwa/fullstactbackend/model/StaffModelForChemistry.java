package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StaffModelForChemistry {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String chemistryHeading;
	
	@Column(columnDefinition = "TEXT")
	private String chemistyContent;

	@Column(columnDefinition = "TEXT")
	private String chemistyContentTwo;
	
	public StaffModelForChemistry() {}

	public StaffModelForChemistry(Long id, String chemistryHeading, String chemistyContent, String chemistyContentTwo) {
		super();
		this.id = id;
		this.chemistryHeading = chemistryHeading;
		this.chemistyContent = chemistyContent;
		this.chemistyContentTwo = chemistyContentTwo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChemistryHeading() {
		return chemistryHeading;
	}

	public void setChemistryHeading(String chemistryHeading) {
		this.chemistryHeading = chemistryHeading;
	}

	public String getChemistyContent() {
		return chemistyContent;
	}

	public void setChemistyContent(String chemistyContent) {
		this.chemistyContent = chemistyContent;
	}

	public String getChemistyContentTwo() {
		return chemistyContentTwo;
	}

	public void setChemistyContentTwo(String chemistyContentTwo) {
		this.chemistyContentTwo = chemistyContentTwo;
	}
	
	
	
	
	
	
}
