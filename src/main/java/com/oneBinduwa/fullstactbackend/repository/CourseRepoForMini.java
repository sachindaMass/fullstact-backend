package com.oneBinduwa.fullstactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneBinduwa.fullstactbackend.model.CourseModelForMini;

public interface CourseRepoForMini extends JpaRepository<CourseModelForMini, Long> {

}
