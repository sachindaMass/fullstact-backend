package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseModelForMini {

	@Id
	@GeneratedValue
	private Long id;

	@Column(columnDefinition = "TEXT")
	private String miniEnglishFirstPara;

	public CourseModelForMini() {
	}

	public CourseModelForMini(Long id, String miniEnglishFirstPara) {
		super();
		this.id = id;
		this.miniEnglishFirstPara = miniEnglishFirstPara;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMiniEnglishFirstPara() {
		return miniEnglishFirstPara;
	}

	public void setMiniEnglishFirstPara(String miniEnglishFirstPara) {
		this.miniEnglishFirstPara = miniEnglishFirstPara;
	}

}
