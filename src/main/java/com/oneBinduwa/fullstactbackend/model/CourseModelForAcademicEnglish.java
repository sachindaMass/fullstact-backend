package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseModelForAcademicEnglish {

	@Id
	@GeneratedValue
	private Long id;

	@Column(columnDefinition = "TEXT")
	private String academicEnglishSecondLangFirstPara;

	@Column(columnDefinition = "TEXT")
	private String academicEnglishSecondLangSecondPara;
	
	public CourseModelForAcademicEnglish() {}

	public CourseModelForAcademicEnglish(Long id, String academicEnglishSecondLangFirstPara,
			String academicEnglishSecondLangSecondPara) {
		super();
		this.id = id;
		this.academicEnglishSecondLangFirstPara = academicEnglishSecondLangFirstPara;
		this.academicEnglishSecondLangSecondPara = academicEnglishSecondLangSecondPara;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAcademicEnglishSecondLangFirstPara() {
		return academicEnglishSecondLangFirstPara;
	}

	public void setAcademicEnglishSecondLangFirstPara(String academicEnglishSecondLangFirstPara) {
		this.academicEnglishSecondLangFirstPara = academicEnglishSecondLangFirstPara;
	}

	public String getAcademicEnglishSecondLangSecondPara() {
		return academicEnglishSecondLangSecondPara;
	}

	public void setAcademicEnglishSecondLangSecondPara(String academicEnglishSecondLangSecondPara) {
		this.academicEnglishSecondLangSecondPara = academicEnglishSecondLangSecondPara;
	}

}
