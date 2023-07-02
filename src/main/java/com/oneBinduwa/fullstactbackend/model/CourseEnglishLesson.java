package com.oneBinduwa.fullstactbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CourseEnglishLesson {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(columnDefinition = "TEXT")
	private String englishLessonFirstPara;
	
	@Column(columnDefinition = "TEXT")
	private String englishSecondPara;
	
	public CourseEnglishLesson() {}

	public CourseEnglishLesson(Long id, String englishLessonFirstPara, String englishSecondPara) {
		super();
		this.id = id;
		this.englishLessonFirstPara = englishLessonFirstPara;
		this.englishSecondPara = englishSecondPara;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnglishLessonFirstPara() {
		return englishLessonFirstPara;
	}

	public void setEnglishLessonFirstPara(String englishLessonFirstPara) {
		this.englishLessonFirstPara = englishLessonFirstPara;
	}

	public String getEnglishSecondPara() {
		return englishSecondPara;
	}

	public void setEnglishSecondPara(String englishSecondPara) {
		this.englishSecondPara = englishSecondPara;
	}
	
	

	
}
