package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class AboutUs {
	
	@jakarta.persistence.Id
	@GeneratedValue
	private Long Id;
	
	@Column(columnDefinition = "TEXT")
	private String misson;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getMisson() {
		return misson;
	}

	public void setMisson(String misson) {
		this.misson = misson;
	}
	
	
	
	
	

}
