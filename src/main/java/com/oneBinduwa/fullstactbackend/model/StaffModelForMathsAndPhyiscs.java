package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StaffModelForMathsAndPhyiscs {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String mathsHeading;
	
	@Column(columnDefinition = "TEXT")
	private String mathsContent;
	
	@Column(columnDefinition = "TEXT")
	private String physicsContent;
	
	public StaffModelForMathsAndPhyiscs() {}

	public StaffModelForMathsAndPhyiscs(Long id, String mathsHeading, String mathsContent, String physicsContent) {
		super();
		this.id = id;
		this.mathsHeading = mathsHeading;
		this.mathsContent = mathsContent;
		this.physicsContent = physicsContent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMathsHeading() {
		return mathsHeading;
	}

	public void setMathsHeading(String mathsHeading) {
		this.mathsHeading = mathsHeading;
	}

	public String getMathsContent() {
		return mathsContent;
	}

	public void setMathsContent(String mathsContent) {
		this.mathsContent = mathsContent;
	}

	public String getPhysicsContent() {
		return physicsContent;
	}

	public void setPhysicsContent(String physicsContent) {
		this.physicsContent = physicsContent;
	}

	
	
	
}
