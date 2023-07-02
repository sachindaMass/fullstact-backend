package com.oneBinduwa.fullstactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneBinduwa.fullstactbackend.model.CourseModelForAcademicEnglish;

public interface CourseRepoForAcademic extends JpaRepository<CourseModelForAcademicEnglish, Long> {

}
