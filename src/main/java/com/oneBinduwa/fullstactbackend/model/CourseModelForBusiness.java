package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseModelForBusiness {

	@Id
	@GeneratedValue
	private Long id;

	@Column(columnDefinition = "TEXT")
	private String businessEnglishSecondLangFirstPara;

	@Column(columnDefinition = "TEXT")
	private String businessEnglishSecondLangSecondPara;
	
	public CourseModelForBusiness() {}

	public CourseModelForBusiness(Long id, String businessEnglishSecondLangFirstPara,
			String businessEnglishSecondLangSecondPara) {
		super();
		this.id = id;
		this.businessEnglishSecondLangFirstPara = businessEnglishSecondLangFirstPara;
		this.businessEnglishSecondLangSecondPara = businessEnglishSecondLangSecondPara;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBusinessEnglishSecondLangFirstPara() {
		return businessEnglishSecondLangFirstPara;
	}

	public void setBusinessEnglishSecondLangFirstPara(String businessEnglishSecondLangFirstPara) {
		this.businessEnglishSecondLangFirstPara = businessEnglishSecondLangFirstPara;
	}

	public String getBusinessEnglishSecondLangSecondPara() {
		return businessEnglishSecondLangSecondPara;
	}

	public void setBusinessEnglishSecondLangSecondPara(String businessEnglishSecondLangSecondPara) {
		this.businessEnglishSecondLangSecondPara = businessEnglishSecondLangSecondPara;
	}

}
