package com.oneBinduwa.fullstactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneBinduwa.fullstactbackend.model.CourseBusinessCategory;

public interface CourseRepoForBusinessCategory extends JpaRepository<CourseBusinessCategory, Long> {

}
