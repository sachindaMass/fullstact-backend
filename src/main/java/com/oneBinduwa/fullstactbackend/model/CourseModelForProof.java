package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseModelForProof {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String proofReadingFirstPara;
	
	@Column(columnDefinition = "TEXT")
	private String proofReadingSecondPara;
	
	@Column(columnDefinition = "TEXT")
	private String proofReadingThridPara;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProofReadingFirstPara() {
		return proofReadingFirstPara;
	}

	public void setProofReadingFirstPara(String proofReadingFirstPara) {
		this.proofReadingFirstPara = proofReadingFirstPara;
	}

	public String getProofReadingSecondPara() {
		return proofReadingSecondPara;
	}

	public void setProofReadingSecondPara(String proofReadingSecondPara) {
		this.proofReadingSecondPara = proofReadingSecondPara;
	}

	public String getProofReadingThridPara() {
		return proofReadingThridPara;
	}

	public void setProofReadingThridPara(String proofReadingThridPara) {
		this.proofReadingThridPara = proofReadingThridPara;
	}
	
	
	
	

}
