package com.oneBinduwa.fullstactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneBinduwa.fullstactbackend.model.StaffModelForManagment;

public interface StaffRepoForManagement extends JpaRepository<StaffModelForManagment, Long> {

}
