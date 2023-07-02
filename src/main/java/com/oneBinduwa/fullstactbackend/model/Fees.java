package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Fees {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String fees;
	
	@Column(columnDefinition = "TEXT")
	private String bank;
	
	@Column(columnDefinition = "TEXT")
	private String bankName;
	
	@Column(columnDefinition = "TEXT")
	private String accountNumber;
	
	@Column(columnDefinition = "TEXT")
	private String particular;
	
	@Column(columnDefinition = "TEXT")
	private String code;
	
	@Column(columnDefinition = "TEXT")
	private String reference;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getParticular() {
		return particular;
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	
	
	
	
	
	

}
