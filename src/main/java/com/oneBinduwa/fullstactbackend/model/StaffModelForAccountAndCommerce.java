package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class StaffModelForAccountAndCommerce {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String accountHeading;
	
	@Column(columnDefinition = "TEXT")
	private String accountContent;

	@Column(columnDefinition = "TEXT")
	private String accountContentTwo;
	
	public StaffModelForAccountAndCommerce() {}

	public StaffModelForAccountAndCommerce(Long id, String accountHeading, String accountContent,
			String accountContentTwo) {
		super();
		this.id = id;
		this.accountHeading = accountHeading;
		this.accountContent = accountContent;
		this.accountContentTwo = accountContentTwo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountHeading() {
		return accountHeading;
	}

	public void setAccountHeading(String accountHeading) {
		this.accountHeading = accountHeading;
	}

	public String getAccountContent() {
		return accountContent;
	}

	public void setAccountContent(String accountContent) {
		this.accountContent = accountContent;
	}

	public String getAccountContentTwo() {
		return accountContentTwo;
	}

	public void setAccountContentTwo(String accountContentTwo) {
		this.accountContentTwo = accountContentTwo;
	}
	

}
