package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StaffModelForManagment {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String managementHeading;
	
	@Column(columnDefinition = "TEXT")
	private String managementContent;
	
	public StaffModelForManagment() {};

	public StaffModelForManagment(Long id, String managementHeading, String managementContent) {
		super();
		this.id = id;
		this.managementHeading = managementHeading;
		this.managementContent = managementContent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManagementHeading() {
		return managementHeading;
	}

	public void setManagementHeading(String managementHeading) {
		this.managementHeading = managementHeading;
	}

	public String getManagementContent() {
		return managementContent;
	}

	public void setManagementContent(String managementContent) {
		this.managementContent = managementContent;
	}

	
}
