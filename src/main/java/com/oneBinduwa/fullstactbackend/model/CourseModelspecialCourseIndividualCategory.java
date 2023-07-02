package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseModelspecialCourseIndividualCategory {

	@Id
	@GeneratedValue
	private Long id;

	@Column(columnDefinition = "TEXT")
	private String specialCourseIndividualFirstPara;

	@Column(columnDefinition = "TEXT")
	private String specailCourseIndividualSecondPara;
	
	public CourseModelspecialCourseIndividualCategory() {}

	public CourseModelspecialCourseIndividualCategory(Long id, String specialCourseIndividualFirstPara,
			String specailCourseIndividualSecondPara) {
		super();
		this.id = id;
		this.specialCourseIndividualFirstPara = specialCourseIndividualFirstPara;
		this.specailCourseIndividualSecondPara = specailCourseIndividualSecondPara;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecialCourseIndividualFirstPara() {
		return specialCourseIndividualFirstPara;
	}

	public void setSpecialCourseIndividualFirstPara(String specialCourseIndividualFirstPara) {
		this.specialCourseIndividualFirstPara = specialCourseIndividualFirstPara;
	}

	public String getSpecailCourseIndividualSecondPara() {
		return specailCourseIndividualSecondPara;
	}

	public void setSpecailCourseIndividualSecondPara(String specailCourseIndividualSecondPara) {
		this.specailCourseIndividualSecondPara = specailCourseIndividualSecondPara;
	}

}
