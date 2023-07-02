package com.oneBinduwa.fullstactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneBinduwa.fullstactbackend.model.CourseModelForBusiness;

public interface CourseRepoForBusiness extends JpaRepository<CourseModelForBusiness, Long> {

}
