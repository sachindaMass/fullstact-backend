package com.oneBinduwa.fullstactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneBinduwa.fullstactbackend.model.Course;

public interface CourseRepositroy extends JpaRepository<Course, Long> {

}
