package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseMiniEnglishCategory {

	@Id
	@GeneratedValue
	private Long id;

	@Column(columnDefinition = "TEXT")
	private String miniEnglishCategory;

	public CourseMiniEnglishCategory() {
	}

	public CourseMiniEnglishCategory(Long id, String miniEnglishCategory) {
		super();
		this.id = id;
		this.miniEnglishCategory = miniEnglishCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMiniEnglishCategory() {
		return miniEnglishCategory;
	}

	public void setMiniEnglishCategory(String miniEnglishCategory) {
		this.miniEnglishCategory = miniEnglishCategory;
	}

}
