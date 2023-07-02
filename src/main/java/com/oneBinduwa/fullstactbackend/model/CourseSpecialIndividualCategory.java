package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseSpecialIndividualCategory {

	@Id
	@GeneratedValue
	private Long id;

	@Column(columnDefinition = "TEXT")
	private String specialIndividualCategoryOne;

	@Column(columnDefinition = "TEXT")
	private String specialIndividualCategoryTwo;

	@Column(columnDefinition = "TEXT")
	private String specialIndividualCategoryThree;

	@Column(columnDefinition = "TEXT")
	private String specialIndividualCategoryFour;

	@Column(columnDefinition = "TEXT")
	private String specialIndividualCategoryFive;

	@Column(columnDefinition = "TEXT")
	private String specialIndividualCategorySix;

	public CourseSpecialIndividualCategory() {
	}

	public CourseSpecialIndividualCategory(Long id, String specialIndividualCategoryOne,
			String specialIndividualCategoryTwo, String specialIndividualCategoryThree,
			String specialIndividualCategoryFour, String specialIndividualCategoryFive,
			String specialIndividualCategorySix) {
		super();
		this.id = id;
		this.specialIndividualCategoryOne = specialIndividualCategoryOne;
		this.specialIndividualCategoryTwo = specialIndividualCategoryTwo;
		this.specialIndividualCategoryThree = specialIndividualCategoryThree;
		this.specialIndividualCategoryFour = specialIndividualCategoryFour;
		this.specialIndividualCategoryFive = specialIndividualCategoryFive;
		this.specialIndividualCategorySix = specialIndividualCategorySix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecialIndividualCategoryOne() {
		return specialIndividualCategoryOne;
	}

	public void setSpecialIndividualCategoryOne(String specialIndividualCategoryOne) {
		this.specialIndividualCategoryOne = specialIndividualCategoryOne;
	}

	public String getSpecialIndividualCategoryTwo() {
		return specialIndividualCategoryTwo;
	}

	public void setSpecialIndividualCategoryTwo(String specialIndividualCategoryTwo) {
		this.specialIndividualCategoryTwo = specialIndividualCategoryTwo;
	}

	public String getSpecialIndividualCategoryThree() {
		return specialIndividualCategoryThree;
	}

	public void setSpecialIndividualCategoryThree(String specialIndividualCategoryThree) {
		this.specialIndividualCategoryThree = specialIndividualCategoryThree;
	}

	public String getSpecialIndividualCategoryFour() {
		return specialIndividualCategoryFour;
	}

	public void setSpecialIndividualCategoryFour(String specialIndividualCategoryFour) {
		this.specialIndividualCategoryFour = specialIndividualCategoryFour;
	}

	public String getSpecialIndividualCategoryFive() {
		return specialIndividualCategoryFive;
	}

	public void setSpecialIndividualCategoryFive(String specialIndividualCategoryFive) {
		this.specialIndividualCategoryFive = specialIndividualCategoryFive;
	}

	public String getSpecialIndividualCategorySix() {
		return specialIndividualCategorySix;
	}

	public void setSpecialIndividualCategorySix(String specialIndividualCategorySix) {
		this.specialIndividualCategorySix = specialIndividualCategorySix;
	}

}
