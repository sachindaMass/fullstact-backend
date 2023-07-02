package com.oneBinduwa.fullstactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneBinduwa.fullstactbackend.model.CourseStandardCategory;

public interface CourseRepoForStandardCategory extends JpaRepository<CourseStandardCategory, Long> {

}
