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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oneBinduwa.fullstactbackend.UserNotFoundException.UserNotFoundException;
import com.oneBinduwa.fullstactbackend.model.Fees;
import com.oneBinduwa.fullstactbackend.repository.FeesRepositroy;

@RestController
@CrossOrigin("http://localhost:3000")
public class FeesController {

	@Autowired
	private FeesRepositroy feesRepositroy;

	@PostMapping("/fees")
	Fees newFees(@RequestBody Fees newFees) {
		return feesRepositroy.save(newFees);
	}

	@GetMapping("/fees")
	List<Fees> getAllFees() {
		return feesRepositroy.findAll();
	}

	@GetMapping("/fees/{id}")
	Fees getFeesById(@PathVariable Long id) {
		return feesRepositroy.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/fees/{id}")
	Fees updateFees(@RequestBody Fees newFees, @PathVariable Long id) {
		return feesRepositroy.findById(id).map(user -> {
			user.setFees(newFees.getFees());
			user.setBank(newFees.getBank());
			user.setBankName(newFees.getBankName());
			user.setAccountNumber(newFees.getAccountNumber());
			user.setParticular(newFees.getParticular());
			user.setCode(newFees.getCode());
			user.setReference(newFees.getReference());
			return feesRepositroy.save(user);

		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/fees/{id}")
	String deleteUser(@PathVariable Long id) {
		if (!feesRepositroy.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		feesRepositroy.deleteById(id);
		return "Fees with id " + id + "has been deleted success";
	}

}
