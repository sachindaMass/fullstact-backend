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
import com.oneBinduwa.fullstactbackend.model.AboutUs;
import com.oneBinduwa.fullstactbackend.repository.AboutUsRepositroy;

@RestController
@RequestMapping("admin")
@CrossOrigin
public class AboutUsController {

	@Autowired
	private AboutUsRepositroy aboutUsRepositroy;

	@PostMapping("/aboutUs")
	AboutUs newAboutUs(@RequestBody AboutUs newAboutUs) {
		return aboutUsRepositroy.save(newAboutUs);
	}

	@GetMapping("/aboutUs")
	List<AboutUs> getAllAboutUs() {
		return aboutUsRepositroy.findAll();
	}

	@GetMapping
	String test() {
		System.out.println("0000");
		return "Hi there";
	}

	@GetMapping("/aboutUs/{id}")
	AboutUs getUserById(@PathVariable Long id) {
		return aboutUsRepositroy.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/aboutUs/{id}")
	AboutUs updateAboutUs(@RequestBody AboutUs newAboutUs, @PathVariable Long id) {
		return aboutUsRepositroy.findById(id).map(user -> {
			user.setMisson(newAboutUs.getMisson());
			return aboutUsRepositroy.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}
	
	@DeleteMapping("/aboutUs/{id}")
	String deleteUser(@PathVariable Long id) {
		if (!aboutUsRepositroy.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		aboutUsRepositroy.deleteById(id);
		return "About Us with id " + id + "has been deleted success";
	}

}
