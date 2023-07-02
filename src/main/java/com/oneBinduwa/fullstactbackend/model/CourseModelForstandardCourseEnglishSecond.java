package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseModelForstandardCourseEnglishSecond {

	@Id
	@GeneratedValue
	private Long id;

	@Column(columnDefinition = "TEXT")
	private String standardCourseEnglishFirstPara;

	@Column(columnDefinition = "TEXT")
	private String standardCourseEnglushSecondPara;

	@Column(columnDefinition = "TEXT")
	private String standardCourseEnglishThirdPara;

	@Column(columnDefinition = "TEXT")
	private String standardCourseEnglishFourthPara;
	
	public CourseModelForstandardCourseEnglishSecond() {}

	public CourseModelForstandardCourseEnglishSecond(Long id, String standardCourseEnglishFirstPara,
			String standardCourseEnglushSecondPara, String standardCourseEnglishThirdPara,
			String standardCourseEnglishFourthPara) {
		super();
		this.id = id;
		this.standardCourseEnglishFirstPara = standardCourseEnglishFirstPara;
		this.standardCourseEnglushSecondPara = standardCourseEnglushSecondPara;
		this.standardCourseEnglishThirdPara = standardCourseEnglishThirdPara;
		this.standardCourseEnglishFourthPara = standardCourseEnglishFourthPara;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStandardCourseEnglishFirstPara() {
		return standardCourseEnglishFirstPara;
	}

	public void setStandardCourseEnglishFirstPara(String standardCourseEnglishFirstPara) {
		this.standardCourseEnglishFirstPara = standardCourseEnglishFirstPara;
	}

	public String getStandardCourseEnglushSecondPara() {
		return standardCourseEnglushSecondPara;
	}

	public void setStandardCourseEnglushSecondPara(String standardCourseEnglushSecondPara) {
		this.standardCourseEnglushSecondPara = standardCourseEnglushSecondPara;
	}

	public String getStandardCourseEnglishThirdPara() {
		return standardCourseEnglishThirdPara;
	}

	public void setStandardCourseEnglishThirdPara(String standardCourseEnglishThirdPara) {
		this.standardCourseEnglishThirdPara = standardCourseEnglishThirdPara;
	}

	public String getStandardCourseEnglishFourthPara() {
		return standardCourseEnglishFourthPara;
	}

	public void setStandardCourseEnglishFourthPara(String standardCourseEnglishFourthPara) {
		this.standardCourseEnglishFourthPara = standardCourseEnglishFourthPara;
	}

}
