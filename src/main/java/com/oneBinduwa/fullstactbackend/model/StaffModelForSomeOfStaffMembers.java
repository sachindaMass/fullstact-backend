package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StaffModelForSomeOfStaffMembers {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String staffMembersHeading;
	
	@Column(columnDefinition = "TEXT")
	private String staffMenebersContent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStaffMembersHeading() {
		return staffMembersHeading;
	}

	public void setStaffMembersHeading(String staffMembersHeading) {
		this.staffMembersHeading = staffMembersHeading;
	}

	public String getStaffMenebersContent() {
		return staffMenebersContent;
	}

	public void setStaffMenebersContent(String staffMenebersContent) {
		this.staffMenebersContent = staffMenebersContent;
	}
	
	
	
}
