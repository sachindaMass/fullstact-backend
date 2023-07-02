package com.oneBinduwa.fullstactbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneBinduwa.fullstactbackend.model.StaffModelForSomeOfStaffMembers;

public interface StaffRepoForStaffMembers extends JpaRepository<StaffModelForSomeOfStaffMembers, Long> {

}
