package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String otherCourses;
	
	@Column(columnDefinition = "TEXT")
	private String otherCoursesSecondPara;
	
	@Column(columnDefinition = "TEXT")
	private String englishLessons;
	
	@Column(columnDefinition = "TEXT")
	private String specialCourses;
	
	@Column(columnDefinition = "TEXT")
	private String strandardCoursesForEnglish;
	
	@Column(columnDefinition = "TEXT")
	private String academicEnglishCourses;
	
	@Column(columnDefinition = "TEXT")
	private String bussinesEnglishCourses;
	
	@Column(columnDefinition = "TEXT")
	private String miniEnglishCourses;
	
	@Column(columnDefinition = "TEXT")
	private String proofReadingAndEditing;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOtherCourses() {
		return otherCourses;
	}

	public void setOtherCourses(String otherCourses) {
		this.otherCourses = otherCourses;
	}

	public String getOtherCoursesSecondPara() {
		return otherCoursesSecondPara;
	}

	public void setOtherCoursesSecondPara(String otherCoursesSecondPara) {
		this.otherCoursesSecondPara = otherCoursesSecondPara;
	}

	public String getEnglishLessons() {
		return englishLessons;
	}

	public void setEnglishLessons(String englishLessons) {
		this.englishLessons = englishLessons;
	}

	public String getSpecialCourses() {
		return specialCourses;
	}

	public void setSpecialCourses(String specialCourses) {
		this.specialCourses = specialCourses;
	}

	public String getStrandardCoursesForEnglish() {
		return strandardCoursesForEnglish;
	}

	public void setStrandardCoursesForEnglish(String strandardCoursesForEnglish) {
		this.strandardCoursesForEnglish = strandardCoursesForEnglish;
	}

	public String getAcademicEnglishCourses() {
		return academicEnglishCourses;
	}

	public void setAcademicEnglishCourses(String academicEnglishCourses) {
		this.academicEnglishCourses = academicEnglishCourses;
	}

	public String getBussinesEnglishCourses() {
		return bussinesEnglishCourses;
	}

	public void setBussinesEnglishCourses(String bussinesEnglishCourses) {
		this.bussinesEnglishCourses = bussinesEnglishCourses;
	}

	public String getMiniEnglishCourses() {
		return miniEnglishCourses;
	}

	public void setMiniEnglishCourses(String miniEnglishCourses) {
		this.miniEnglishCourses = miniEnglishCourses;
	}

	public String getProofReadingAndEditing() {
		return proofReadingAndEditing;
	}

	public void setProofReadingAndEditing(String proofReadingAndEditing) {
		this.proofReadingAndEditing = proofReadingAndEditing;
	}
	
	
	
	
	
	
	
	
	
}
