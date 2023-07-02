package com.oneBinduwa.fullstactbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oneBinduwa.fullstactbackend.UserNotFoundException.UserNotFoundException;
import com.oneBinduwa.fullstactbackend.model.StaffModelForAccountAndCommerce;
import com.oneBinduwa.fullstactbackend.model.StaffModelForBiology;
import com.oneBinduwa.fullstactbackend.model.StaffModelForChemistry;
import com.oneBinduwa.fullstactbackend.model.StaffModelForEnglish;
import com.oneBinduwa.fullstactbackend.model.StaffModelForManagment;
import com.oneBinduwa.fullstactbackend.model.StaffModelForMathsAndPhyiscs;
import com.oneBinduwa.fullstactbackend.model.StaffModelForScience;
import com.oneBinduwa.fullstactbackend.model.StaffModelForSomeOfStaffMembers;
import com.oneBinduwa.fullstactbackend.repository.StaffRepoForAccountAndCommerece;
import com.oneBinduwa.fullstactbackend.repository.StaffRepoForBio;
import com.oneBinduwa.fullstactbackend.repository.StaffRepoForChemistry;
import com.oneBinduwa.fullstactbackend.repository.StaffRepoForEnglish;
import com.oneBinduwa.fullstactbackend.repository.StaffRepoForManagement;
import com.oneBinduwa.fullstactbackend.repository.StaffRepoForMathsAndPhyisc;
import com.oneBinduwa.fullstactbackend.repository.StaffRepoForScience;
import com.oneBinduwa.fullstactbackend.repository.StaffRepoForStaffMembers;

@RestController
@CrossOrigin("http://localhost:3000")
public class StaffController {

	@Autowired
	private StaffRepoForManagement staffRepoForManagement;

	@Autowired
	private StaffRepoForStaffMembers staffRepoForStaffMembers;

	@Autowired
	private StaffRepoForMathsAndPhyisc staffRepoForMathsAndPhyisc;

	@Autowired
	private StaffRepoForChemistry staffRepoForChemistry;

	@Autowired
	private StaffRepoForBio staffRepoForBio;

	@Autowired
	private StaffRepoForScience staffRepoForScience;

	@Autowired
	private StaffRepoForEnglish staffRepoForEnglish;

	@Autowired
	private StaffRepoForAccountAndCommerece staffRepoForAccountAndCommerece;

	@PostMapping("/management")
	StaffModelForManagment newManagement(@RequestBody StaffModelForManagment newCourse) {
		return staffRepoForManagement.save(newCourse);
	}

	@GetMapping("/management")
	List<StaffModelForManagment> getAllManagement() {
		return staffRepoForManagement.findAll();
	}

	@GetMapping("/management/{id}")
	StaffModelForManagment getManagementById(@PathVariable("id") Long id) {
		return staffRepoForManagement.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/management/{id}")
	StaffModelForManagment updatedManagemente(@RequestBody StaffModelForManagment updatedManagemente,
			@PathVariable Long id) {
		return staffRepoForManagement.findById(id).map(user -> {
			user.setManagementHeading(updatedManagemente.getManagementHeading());
			user.setManagementContent(updatedManagemente.getManagementContent());
			return staffRepoForManagement.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/management/{id}")
	String deleteUser(@PathVariable Long id) {
		if (!staffRepoForManagement.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		staffRepoForManagement.deleteById(id);
		return "staff with management id " + id + " has been deleted success";
	}

//	------------------------------------- some of staff members ------------------------------------------------------

	@PostMapping("/staffMembers")
	StaffModelForSomeOfStaffMembers newStaff(@RequestBody StaffModelForSomeOfStaffMembers newStaff) {
		return staffRepoForStaffMembers.save(newStaff);
	}

	@GetMapping("/staffMembers")
	List<StaffModelForSomeOfStaffMembers> getAllStaff() {
		return staffRepoForStaffMembers.findAll();
	}

	@GetMapping("/staffMembers/{id}")
	StaffModelForSomeOfStaffMembers getStaffById(@PathVariable Long id) {
		return staffRepoForStaffMembers.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/staffMembers/{id}")
	StaffModelForSomeOfStaffMembers updatedStaff(@RequestBody StaffModelForSomeOfStaffMembers updatedStaff,
			@PathVariable Long id) {
		return staffRepoForStaffMembers.findById(id).map(user -> {
			user.setStaffMembersHeading(updatedStaff.getStaffMembersHeading());
			user.setStaffMenebersContent(updatedStaff.getStaffMenebersContent());
			return staffRepoForStaffMembers.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/staffMembers/{id}")
	String deleteStaff(@PathVariable Long id) {
		if (!staffRepoForStaffMembers.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		staffRepoForStaffMembers.deleteById(id);
		return "staff with  id " + id + " has been deleted success";
	}

//	------------------------------------- Math and Physics ---------------------------------------------- 

	@PostMapping("/mathsAndPhysic")
	StaffModelForMathsAndPhyiscs newmathsAndPhysic(@RequestBody StaffModelForMathsAndPhyiscs newmathsAndPhysic) {
		return staffRepoForMathsAndPhyisc.save(newmathsAndPhysic);
	}

	@GetMapping("/mathsAndPhysic")
	List<StaffModelForMathsAndPhyiscs> getAllmathsAndPhysic() {
		return staffRepoForMathsAndPhyisc.findAll();
	}

	@GetMapping("/mathsAndPhysic/{id}")
	StaffModelForMathsAndPhyiscs getmathsAndPhysicById(@PathVariable Long id) {
		return staffRepoForMathsAndPhyisc.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/mathsAndPhysic/{id}")
	StaffModelForMathsAndPhyiscs updatedmathsAndPhysic(@RequestBody StaffModelForMathsAndPhyiscs updatedmathsAndPhysic,
			@PathVariable Long id) {
		return staffRepoForMathsAndPhyisc.findById(id).map(user -> {
			user.setMathsHeading(updatedmathsAndPhysic.getMathsHeading());
			user.setMathsContent(updatedmathsAndPhysic.getMathsContent());
			user.setPhysicsContent(updatedmathsAndPhysic.getPhysicsContent());
			return staffRepoForMathsAndPhyisc.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/mathsAndPhysic/{id}")
	String deleteMathsAndPhysic(@PathVariable Long id) {
		if (!staffRepoForMathsAndPhyisc.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		staffRepoForMathsAndPhyisc.deleteById(id);
		return "maths with  id " + id + " has been deleted success";
	}

//	--------------------------------------------------- Chemistry ------------------------------------------------------------

	@PostMapping("/chemistry")
	StaffModelForChemistry newChemistry(@RequestBody StaffModelForChemistry newChemistry) {
		return staffRepoForChemistry.save(newChemistry);
	}

	@GetMapping("/chemistry")
	List<StaffModelForChemistry> getAllChemistry() {
		return staffRepoForChemistry.findAll();
	}

	@GetMapping("/chemistry/{id}")
	StaffModelForChemistry getChemistryById(@PathVariable Long id) {
		return staffRepoForChemistry.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/chemistry/{id}")
	StaffModelForChemistry updatedchemistry(@RequestBody StaffModelForChemistry updatedchemistry,
			@PathVariable Long id) {
		return staffRepoForChemistry.findById(id).map(user -> {
			user.setChemistryHeading(updatedchemistry.getChemistryHeading());
			user.setChemistyContent(updatedchemistry.getChemistyContent());
			user.setChemistyContentTwo(updatedchemistry.getChemistyContentTwo());
			return staffRepoForChemistry.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/chemistry/{id}")
	String deleteChemistry(@PathVariable Long id) {
		if (!staffRepoForChemistry.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		staffRepoForChemistry.deleteById(id);
		return "chemistry with  id " + id + " has been deleted success";
	}

//	----------------------------------------- Biology --------------------------------------------------

	@PostMapping("/biology")
	StaffModelForBiology newBiology(@RequestBody StaffModelForBiology newBiology) {
		return staffRepoForBio.save(newBiology);
	}

	@GetMapping("/biology")
	List<StaffModelForBiology> getAllBiology() {
		return staffRepoForBio.findAll();
	}

	@GetMapping("/biology/{id}")
	StaffModelForBiology getBiologyById(@PathVariable Long id) {
		return staffRepoForBio.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/biology/{id}")
	StaffModelForBiology updatedBiology(@RequestBody StaffModelForBiology updatedBiology, @PathVariable Long id) {
		return staffRepoForBio.findById(id).map(user -> {
			user.setBioHeading(updatedBiology.getBioHeading());
			user.setBioContent(updatedBiology.getBioContent());
			user.setBioContentTwo(updatedBiology.getBioContentTwo());
			return staffRepoForBio.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/biology/{id}")
	String deleteBiology(@PathVariable Long id) {
		if (!staffRepoForBio.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		staffRepoForBio.deleteById(id);
		return "bio with  id " + id + " has been deleted success";
	}

//	------------------------------------- Science -------------------------------------------------------

	@PostMapping("/science")
	StaffModelForScience newScience(@RequestBody StaffModelForScience newScience) {
		return staffRepoForScience.save(newScience);
	}

	@GetMapping("/science")
	List<StaffModelForScience> getAllScience() {
		return staffRepoForScience.findAll();
	}

	@GetMapping("/science/{id}")
	StaffModelForScience getScienceById(@PathVariable Long id) {
		return staffRepoForScience.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/science/{id}")
	StaffModelForScience updatedScience(@RequestBody StaffModelForScience updatedScience, @PathVariable Long id) {
		return staffRepoForScience.findById(id).map(user -> {
			user.setScienceHeading(updatedScience.getScienceHeading());
			user.setScienceContent(updatedScience.getScienceContent());
			user.setScienceContentTwo(updatedScience.getScienceContentTwo());
			return staffRepoForScience.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/science/{id}")
	String deleteScience(@PathVariable Long id) {
		if (!staffRepoForScience.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		staffRepoForScience.deleteById(id);
		return "science with  id " + id + " has been deleted success";
	}

//	-------------------------------------- English -------------------------------------------------------

	@PostMapping("/english")
	StaffModelForEnglish newEnglish(@RequestBody StaffModelForEnglish newEnglish) {
		return staffRepoForEnglish.save(newEnglish);
	}

	@GetMapping("/english")
	List<StaffModelForEnglish> getAllEnglish() {
		return staffRepoForEnglish.findAll();
	}

	@GetMapping("/english/{id}")
	StaffModelForEnglish getEnglishById(@PathVariable Long id) {
		return staffRepoForEnglish.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/english/{id}")
	StaffModelForEnglish updatedEnglish(@RequestBody StaffModelForEnglish updatedEnglish, @PathVariable Long id) {
		return staffRepoForEnglish.findById(id).map(user -> {
			user.setEnglishHeading(updatedEnglish.getEnglishHeading());
			user.setEnglishContent(updatedEnglish.getEnglishContent());
			user.setEnglishContentTwo(updatedEnglish.getEnglishContentTwo());
			return staffRepoForEnglish.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/english/{id}")
	String deleteEnglish(@PathVariable Long id) {
		if (!staffRepoForEnglish.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		staffRepoForEnglish.deleteById(id);
		return "english with  id " + id + " has been deleted success";
	}

//	----------------------------------- Accounting and Commerce ---------------------------------------------

	@PostMapping("/accountingAndCommerce")
	StaffModelForAccountAndCommerce newAccountingAndCommerce(
			@RequestBody StaffModelForAccountAndCommerce newAccountingAndCommerce) {
		return staffRepoForAccountAndCommerece.save(newAccountingAndCommerce);
	}

	@GetMapping("/accountingAndCommerce")
	List<StaffModelForAccountAndCommerce> getAllAccount() {
		return staffRepoForAccountAndCommerece.findAll();
	}

	@GetMapping("/accountingAndCommerce/{id}")
	StaffModelForAccountAndCommerce getAccpountById(@PathVariable Long id) {
		return staffRepoForAccountAndCommerece.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/accountingAndCommerce/{id}")
	StaffModelForAccountAndCommerce updatedAccpount(@RequestBody StaffModelForAccountAndCommerce updatedAccpount,
			@PathVariable Long id) {
		return staffRepoForAccountAndCommerece.findById(id).map(user -> {
			user.setAccountHeading(updatedAccpount.getAccountHeading());
			user.setAccountContent(updatedAccpount.getAccountContent());
			user.setAccountContentTwo(updatedAccpount.getAccountContentTwo());
			return staffRepoForAccountAndCommerece.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/accountingAndCommerce/{id}")
	String deleteAccount(@PathVariable Long id) {
		if (!staffRepoForAccountAndCommerece.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		staffRepoForAccountAndCommerece.deleteById(id);
		return "english with  id " + id + " has been deleted success";
	}

}
