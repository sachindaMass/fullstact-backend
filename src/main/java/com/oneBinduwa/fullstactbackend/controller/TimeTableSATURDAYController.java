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
import com.oneBinduwa.fullstactbackend.model.TimeTableFriday;
import com.oneBinduwa.fullstactbackend.model.TimeTableMonday;
import com.oneBinduwa.fullstactbackend.model.TimeTableSATURDAY;
import com.oneBinduwa.fullstactbackend.model.TimeTableThursday;
import com.oneBinduwa.fullstactbackend.model.TimeTableTuesday;
import com.oneBinduwa.fullstactbackend.model.TimeTableWends;
import com.oneBinduwa.fullstactbackend.repository.TimeTableFridayRepositroy;
import com.oneBinduwa.fullstactbackend.repository.TimeTableMondayRepositroy;
import com.oneBinduwa.fullstactbackend.repository.TimeTableRepositroySATURDAY;
import com.oneBinduwa.fullstactbackend.repository.TimeTableThursdayRepositroy;
import com.oneBinduwa.fullstactbackend.repository.TimeTableTuesdayRepositroy;
import com.oneBinduwa.fullstactbackend.repository.TimeTableWendsRepositroy;

@RestController
@CrossOrigin("http://localhost:3000")
public class TimeTableSATURDAYController {

	@Autowired
	private TimeTableRepositroySATURDAY timeTableRepositroy;

	@Autowired
	private TimeTableMondayRepositroy timeTableMondayRepositroy;

	@Autowired
	private TimeTableTuesdayRepositroy timeTableTuesdayRepositroy;

	@Autowired
	private TimeTableWendsRepositroy timeTableWendsRepositroy;

	@Autowired
	private TimeTableThursdayRepositroy timeTableThursdayRepositroy;

	@Autowired
	private TimeTableFridayRepositroy timeTableFridayRepositroy;

	@PostMapping("/time-table/saturday")
	TimeTableSATURDAY newTimeTable(@RequestBody TimeTableSATURDAY newTimeTable) {
		return timeTableRepositroy.save(newTimeTable);
	}

	@GetMapping("/time-table/saturday")
	List<TimeTableSATURDAY> getAllTimeTable() {
		return timeTableRepositroy.findAll();
	}

	@GetMapping("/time-table/saturday/{id}")
	TimeTableSATURDAY getUserById(@PathVariable Long id) {
		return timeTableRepositroy.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/time-table/saturday/{id}")
	TimeTableSATURDAY updateStar(@RequestBody TimeTableSATURDAY newSaturday, @PathVariable Long id) {
		return timeTableRepositroy.findById(id).map(user -> {
			user.setGrade(newSaturday.getGrade());
			user.setSubject(newSaturday.getSubject());
			user.setTime(newSaturday.getTime());
			return timeTableRepositroy.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/time-table/saturday/{id}")
	String deleteUserSatur(@PathVariable Long id) {
		if (!timeTableRepositroy.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		timeTableRepositroy.deleteById(id);
		return "Saturday Feild with id " + id + "has been deleted success";
	}

//	---------------------------------- MONDAY --------------------------------------------
	@PostMapping("/time-table/monday")
	TimeTableMonday newTimeTableMonday(@RequestBody TimeTableMonday newTimeTable) {
		return timeTableMondayRepositroy.save(newTimeTable);
	}

	@GetMapping("/time-table/monday")
	List<TimeTableMonday> getAllTimeTableMonday() {
		return timeTableMondayRepositroy.findAll();
	}

	@GetMapping("/time-table/monday/{id}")
	TimeTableMonday getUserByIdMonday(@PathVariable Long id) {
		return timeTableMondayRepositroy.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/time-table/monday/{id}")
	TimeTableMonday updateMonday(@RequestBody TimeTableMonday newMonday, @PathVariable Long id) {
		return timeTableMondayRepositroy.findById(id).map(user -> {
			user.setGrade(newMonday.getGrade());
			user.setSubject(newMonday.getSubject());
			user.setTime(newMonday.getTime());
			return timeTableMondayRepositroy.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/time-table/monday/{id}")
	String deleteUser(@PathVariable Long id) {
		if (!timeTableMondayRepositroy.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		timeTableMondayRepositroy.deleteById(id);
		return "Monday Feild with id " + id + "has been deleted success";
	}
//	-------------------------- ---------Tuesday---------------------------------------------------------

	@PostMapping("/time-table/tuesday")
	TimeTableTuesday newTimeTableTuesday(@RequestBody TimeTableTuesday newTimeTable) {
		return timeTableTuesdayRepositroy.save(newTimeTable);
	}

	@GetMapping("/time-table/tuesday")
	List<TimeTableTuesday> getAllTimeTableTuesday() {
		return timeTableTuesdayRepositroy.findAll();
	}

	@GetMapping("/time-table/tuesday/{id}")
	TimeTableTuesday getUserByIdTuesday(@PathVariable Long id) {
		return timeTableTuesdayRepositroy.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/time-table/tuesday/{id}")
	TimeTableTuesday updateTusday(@RequestBody TimeTableTuesday newTuesday, @PathVariable Long id) {
		return timeTableTuesdayRepositroy.findById(id).map(user -> {
			user.setGrade(newTuesday.getGrade());
			user.setSubject(newTuesday.getSubject());
			user.setTime(newTuesday.getTime());
			return timeTableTuesdayRepositroy.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/time-table/tuesday/{id}")
	String deleteUserTuesday(@PathVariable Long id) {
		if (!timeTableTuesdayRepositroy.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		timeTableTuesdayRepositroy.deleteById(id);
		return "Tuesday Feild with id " + id + "has been deleted success";
	}

//	------------------------------------ WendsDay-------------------------------------------

	@PostMapping("/time-table/wednesday")
	TimeTableWends newTimeTableWednesday(@RequestBody TimeTableWends newTimeTable) {
		return timeTableWendsRepositroy.save(newTimeTable);
	}

	@GetMapping("/time-table/wednesday")
	List<TimeTableWends> getAllTimeTableWednesday() {
		return timeTableWendsRepositroy.findAll();
	}

	@GetMapping("/time-table/wednesday/{id}")
	TimeTableWends getUserByIdWends(@PathVariable Long id) {
		return timeTableWendsRepositroy.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/time-table/wednesday/{id}")
	TimeTableWends updateWensday(@RequestBody TimeTableWends newWends, @PathVariable Long id) {
		return timeTableWendsRepositroy.findById(id).map(user -> {
			user.setGrade(newWends.getGrade());
			user.setSubject(newWends.getSubject());
			user.setTime(newWends.getTime());
			return timeTableWendsRepositroy.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/time-table/wednesday/{id}")
	String deleteUserWends(@PathVariable Long id) {
		if (!timeTableWendsRepositroy.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		timeTableWendsRepositroy.deleteById(id);
		return "Wendsday Feild with id " + id + "has been deleted success";
	}

//	------------------------------------ Thursday -------------------------------------------------------

	@PostMapping("/time-table/thursday")
	TimeTableThursday newTimeTableThursday(@RequestBody TimeTableThursday newTimeTable) {
		return timeTableThursdayRepositroy.save(newTimeTable);
	}

	@GetMapping("/time-table/thursday")
	List<TimeTableThursday> getAllTimeTableThursday() {
		return timeTableThursdayRepositroy.findAll();
	}

	@GetMapping("/time-table/thursday/{id}")
	TimeTableThursday getUserByIdThurs(@PathVariable Long id) {
		return timeTableThursdayRepositroy.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/time-table/thursday/{id}")
	TimeTableThursday updateThursday(@RequestBody TimeTableThursday newThursday, @PathVariable Long id) {
		return timeTableThursdayRepositroy.findById(id).map(user -> {
			user.setGrade(newThursday.getGrade());
			user.setSubject(newThursday.getSubject());
			user.setTime(newThursday.getTime());
			return timeTableThursdayRepositroy.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/time-table/thursday/{id}")
	String deleteUserThursday(@PathVariable Long id) {
		if (!timeTableThursdayRepositroy.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		timeTableThursdayRepositroy.deleteById(id);
		return "Thursday Feild with id " + id + "has been deleted success";
	}

//	---------------------------------------- Friday ------------------------------------------------

	@PostMapping("/time-table/friday")
	TimeTableFriday newTimeTableFriday(@RequestBody TimeTableFriday newTimeTable) {
		return timeTableFridayRepositroy.save(newTimeTable);
	}

	@GetMapping("/time-table/friday")
	List<TimeTableFriday> getAllTimeTableFriday() {
		return timeTableFridayRepositroy.findAll();
	}

	@GetMapping("/time-table/friday/{id}")
	TimeTableFriday getUserByIdFriday(@PathVariable Long id) {
		return timeTableFridayRepositroy.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/time-table/friday/{id}")
	TimeTableFriday updateFriday(@RequestBody TimeTableFriday newFriday, @PathVariable Long id) {
		return timeTableFridayRepositroy.findById(id).map(user -> {
			user.setGrade(newFriday.getGrade());
			user.setSubject(newFriday.getSubject());
			user.setTime(newFriday.getTime());
			return timeTableFridayRepositroy.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/time-table/friday/{id}")
	String deleteUserFriday(@PathVariable Long id) {
		if (!timeTableFridayRepositroy.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		timeTableFridayRepositroy.deleteById(id);
		return "Friday Feild with id " + id + "has been deleted success";
	}

}
