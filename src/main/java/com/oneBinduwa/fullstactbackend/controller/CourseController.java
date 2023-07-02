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
import com.oneBinduwa.fullstactbackend.model.Course;
import com.oneBinduwa.fullstactbackend.model.CourseAcademicCategory;
import com.oneBinduwa.fullstactbackend.model.CourseBusinessCategory;
import com.oneBinduwa.fullstactbackend.model.CourseEnglishCategory;
import com.oneBinduwa.fullstactbackend.model.CourseEnglishLesson;
import com.oneBinduwa.fullstactbackend.model.CourseMiniEnglishCategory;
import com.oneBinduwa.fullstactbackend.model.CourseModelForAcademicEnglish;
import com.oneBinduwa.fullstactbackend.model.CourseModelForBusiness;
import com.oneBinduwa.fullstactbackend.model.CourseModelForMini;
import com.oneBinduwa.fullstactbackend.model.CourseModelForProof;
import com.oneBinduwa.fullstactbackend.model.CourseModelForstandardCourseEnglishSecond;
import com.oneBinduwa.fullstactbackend.model.CourseModelspecialCourseIndividualCategory;
import com.oneBinduwa.fullstactbackend.model.CourseProofReadingCategory;
import com.oneBinduwa.fullstactbackend.model.CourseSpecialIndividualCategory;
import com.oneBinduwa.fullstactbackend.model.CourseStandardCategory;
import com.oneBinduwa.fullstactbackend.repository.CourseEnglishRepoForSpecialCourseCategory;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForAcademic;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForBusiness;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForBusinessCategory;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForEnglishCategory;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForEnglishLesson;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForMini;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForMiniEnglishCategory;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForProof;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForProofReadingCategory;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForStandardCategory;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForStandardEnglish;
import com.oneBinduwa.fullstactbackend.repository.CourseRepoForspecialCourseIndividualCategory;
import com.oneBinduwa.fullstactbackend.repository.CourseReporForAcademicCategory;
import com.oneBinduwa.fullstactbackend.repository.CourseRepositroy;

@RestController
@CrossOrigin("http://localhost:3000")
public class CourseController {

	@Autowired
	private CourseRepositroy courseRepositroy;

	@Autowired
	private CourseRepoForEnglishLesson courseRepoForEnglishLesson;

	@Autowired
	private CourseRepoForspecialCourseIndividualCategory courseRepoForspecialCourseIndividualCategory;

	@Autowired
	private CourseRepoForStandardEnglish courseRepoForStandardEnglish;

	@Autowired
	private CourseRepoForAcademic courseRepoForAcademic;

	@Autowired
	private CourseRepoForBusiness courseRepoForBusiness;

	@Autowired
	private CourseRepoForMini courseRepoForMini;

	@Autowired
	private CourseRepoForProof courseRepoForProof;

	@Autowired
	private CourseRepoForEnglishCategory courseRepoForEnglishCategory;

	@Autowired
	private CourseEnglishRepoForSpecialCourseCategory courseEnglishRepoForSpecialCourseCategory;

	@Autowired
	private CourseRepoForStandardCategory courseRepoForStandardCategory;

	@Autowired
	private CourseReporForAcademicCategory courseReporForAcademicCategory;

	@Autowired
	private CourseRepoForBusinessCategory courseRepoForBusinessCategory;

	@Autowired
	private CourseRepoForMiniEnglishCategory courseRepoForMiniEnglishCategory;

	@Autowired
	private CourseRepoForProofReadingCategory courseRepoForProofReadingCategory;

//	---------------------------------------- Other Course -------------------------------------------------

	@PostMapping("/courses")
	Course newCourse(@RequestBody Course newCourse) {
		return courseRepositroy.save(newCourse);
	}

	@GetMapping("/courses")
	List<Course> getAllCourses() {
		return courseRepositroy.findAll();
	}

	@GetMapping("/courses/{id}")
	Course getUserById(@PathVariable Long id) {
		return courseRepositroy.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/courses/{id}")
	Course updateCourse(@RequestBody Course newCourse, @PathVariable Long id) {
		return courseRepositroy.findById(id).map(user -> {
			user.setOtherCourses(newCourse.getOtherCourses());
			user.setOtherCoursesSecondPara(newCourse.getOtherCoursesSecondPara());
			user.setEnglishLessons(newCourse.getEnglishLessons());
			user.setSpecialCourses(newCourse.getSpecialCourses());
			user.setStrandardCoursesForEnglish(newCourse.getStrandardCoursesForEnglish());
			user.setAcademicEnglishCourses(newCourse.getAcademicEnglishCourses());
			user.setBussinesEnglishCourses(newCourse.getBussinesEnglishCourses());
			user.setMiniEnglishCourses(newCourse.getMiniEnglishCourses());
			user.setProofReadingAndEditing(newCourse.getProofReadingAndEditing());
			return courseRepositroy.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/courses/{id}")
	String deleteUser(@PathVariable Long id) {
		if (!courseRepositroy.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepositroy.deleteById(id);
		return "Course with id " + id + "has been deleted success";
	}

//	---------------------------------------- English Course -------------------------------------------------

	@PostMapping("/englishLesson")
	CourseEnglishLesson englishCourse(@RequestBody CourseEnglishLesson englishCourse) {
		return courseRepoForEnglishLesson.save(englishCourse);
	}

	@GetMapping("/englishLesson")
	List<CourseEnglishLesson> getAllEnglishCourses() {
		return courseRepoForEnglishLesson.findAll();
	}

	@GetMapping("/englishLesson/{id}")
	CourseEnglishLesson getEnglishCoursesById(@PathVariable Long id) {
		return courseRepoForEnglishLesson.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/englishLesson/{id}")
	CourseEnglishLesson updatedEnglishCourse(@RequestBody CourseEnglishLesson updatedEnglishCourse,
			@PathVariable Long id) {
		return courseRepoForEnglishLesson.findById(id).map(user -> {
			user.setEnglishLessonFirstPara(updatedEnglishCourse.getEnglishLessonFirstPara());
			user.setEnglishSecondPara(updatedEnglishCourse.getEnglishSecondPara());
			return courseRepoForEnglishLesson.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/englishLesson/{id}")
	String deleteEnglishLesson(@PathVariable Long id) {
		if (!courseRepoForEnglishLesson.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForEnglishLesson.deleteById(id);
		return "English with id " + id + " has been deleted successfully";
	}

//	---------------------------------------- English Course Category -------------------------------------------------

	@PostMapping("/englishLesson/category")
	CourseEnglishCategory englishCourseCategory(@RequestBody CourseEnglishCategory englishCourseCategory) {
		return courseRepoForEnglishCategory.save(englishCourseCategory);
	}

	@GetMapping("/englishLesson/category")
	List<CourseEnglishCategory> getAllEnglishCategories() {
		return courseRepoForEnglishCategory.findAll();
	}

	@GetMapping("/englishLesson/category/{id}")
	CourseEnglishCategory getAllEnglishCategoryById(@PathVariable Long id) {
		return courseRepoForEnglishCategory.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/englishLesson/category/{id}")
	CourseEnglishCategory updateEnglishCategory(@RequestBody CourseEnglishCategory updateEnglishCategory,
			@PathVariable Long id) {
		return courseRepoForEnglishCategory.findById(id).map(user -> {
			user.setEnglishCategory(updateEnglishCategory.getEnglishCategory());
			return courseRepoForEnglishCategory.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/englishLesson/category/{id}")
	String deleteEnglishCategory(@PathVariable Long id) {
		if (!courseRepoForEnglishCategory.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForEnglishCategory.deleteById(id);
		return "English Category id " + " has been deleted successfully.";
	}

//	------------------------------------------- Special Course Individual -----------------------------------------

	@PostMapping("/specialCourseIndvidual")
	CourseModelspecialCourseIndividualCategory specialCourseIndvidual(
			@RequestBody CourseModelspecialCourseIndividualCategory specialCourseIndvidual) {
		return courseRepoForspecialCourseIndividualCategory.save(specialCourseIndvidual);
	}

	@GetMapping("/specialCourseIndvidual")
	List<CourseModelspecialCourseIndividualCategory> getAllSpecialCourseIndvidual() {
		return courseRepoForspecialCourseIndividualCategory.findAll();
	}

	@GetMapping("/specialCourseIndvidual/{id}")
	CourseModelspecialCourseIndividualCategory getSpecialCourseIndvidualById(@PathVariable Long id) {
		return courseRepoForspecialCourseIndividualCategory.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/specialCourseIndvidual/{id}")
	CourseModelspecialCourseIndividualCategory updateSpecialCourseIndvidual(
			@RequestBody CourseModelspecialCourseIndividualCategory updateSpecialCourseIndvidual,
			@PathVariable Long id) {
		return courseRepoForspecialCourseIndividualCategory.findById(id).map(user -> {
			user.setSpecialCourseIndividualFirstPara(
					updateSpecialCourseIndvidual.getSpecialCourseIndividualFirstPara());
			user.setSpecailCourseIndividualSecondPara(
					updateSpecialCourseIndvidual.getSpecailCourseIndividualSecondPara());
			return courseRepoForspecialCourseIndividualCategory.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/specialCourseIndvidual/{id}")
	String deleteSpecialCourseIndvidual(@PathVariable Long id) {
		if (!courseRepoForspecialCourseIndividualCategory.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForspecialCourseIndividualCategory.deleteById(id);
		return "special Course Indvidual with id " + id + " has been deleted success";
	}

//	---------------------------------------- Special Course Individual Category --------------------------------------

	@PostMapping("/specialCourseIndvidual/category")
	CourseSpecialIndividualCategory specialCourseCategory(
			@RequestBody CourseSpecialIndividualCategory specialCourseCategory) {
		return courseEnglishRepoForSpecialCourseCategory.save(specialCourseCategory);
	}

	@GetMapping("/specialCourseIndvidual/category")
	List<CourseSpecialIndividualCategory> getAllSpecialCategories() {
		return courseEnglishRepoForSpecialCourseCategory.findAll();
	}

	@GetMapping("/specialCourseIndvidual/category/{id}")
	CourseSpecialIndividualCategory getAllSpecailCategoryById(@PathVariable Long id) {
		return courseEnglishRepoForSpecialCourseCategory.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/specialCourseIndvidual/category/{id}")
	CourseSpecialIndividualCategory updateSpecailCategory(
			@RequestBody CourseSpecialIndividualCategory updateSpecailCategory, @PathVariable Long id) {
		return courseEnglishRepoForSpecialCourseCategory.findById(id).map(user -> {
			user.setSpecialIndividualCategoryOne(updateSpecailCategory.getSpecialIndividualCategoryOne());
			user.setSpecialIndividualCategoryTwo(updateSpecailCategory.getSpecialIndividualCategoryTwo());
			user.setSpecialIndividualCategoryThree(updateSpecailCategory.getSpecialIndividualCategoryThree());
			user.setSpecialIndividualCategoryFour(updateSpecailCategory.getSpecialIndividualCategoryFour());
			user.setSpecialIndividualCategoryFive(updateSpecailCategory.getSpecialIndividualCategoryFive());
			user.setSpecialIndividualCategorySix(updateSpecailCategory.getSpecialIndividualCategorySix());
			return courseEnglishRepoForSpecialCourseCategory.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/specialCourseIndvidual/category/{id}")
	String deleteSpecailCategory(@PathVariable Long id) {
		if (!courseEnglishRepoForSpecialCourseCategory.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseEnglishRepoForSpecialCourseCategory.deleteById(id);
		return "Spcail Category id " + " has been deleted successfully.";
	}
//	------------------------------------------ standardCourseEnglushSecondPara --------------------------------------

	@PostMapping("/standardCourseEnglish")
	CourseModelForstandardCourseEnglishSecond standardCourseEnglishCourse(
			@RequestBody CourseModelForstandardCourseEnglishSecond standardCourseEnglushSecondPara) {
		return courseRepoForStandardEnglish.save(standardCourseEnglushSecondPara);
	}

	@GetMapping("/standardCourseEnglish")
	List<CourseModelForstandardCourseEnglishSecond> getStandardCourseEnglishCourse() {
		return courseRepoForStandardEnglish.findAll();
	}

	@GetMapping("/standardCourseEnglish/{id}")
	CourseModelForstandardCourseEnglishSecond getStandardCourseEnglishCourseById(@PathVariable Long id) {
		return courseRepoForStandardEnglish.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/standardCourseEnglish/{id}")
	CourseModelForstandardCourseEnglishSecond updateStandardCourseEnglishCourse(
			@RequestBody CourseModelForstandardCourseEnglishSecond updateStandardCourseEnglishCourse,
			@PathVariable Long id) {
		return courseRepoForStandardEnglish.findById(id).map(user -> {
			user.setStandardCourseEnglishFirstPara(
					updateStandardCourseEnglishCourse.getStandardCourseEnglishFirstPara());
			user.setStandardCourseEnglushSecondPara(
					updateStandardCourseEnglishCourse.getStandardCourseEnglushSecondPara());
			user.setStandardCourseEnglishThirdPara(
					updateStandardCourseEnglishCourse.getStandardCourseEnglishThirdPara());
			user.setStandardCourseEnglishFourthPara(
					updateStandardCourseEnglishCourse.getStandardCourseEnglishFourthPara());
			return courseRepoForStandardEnglish.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/standardCourseEnglish/{id}")
	String deleteStandardCourseEnglishCourse(@PathVariable Long id) {
		if (!courseRepoForStandardEnglish.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForStandardEnglish.deleteById(id);
		return "standard Course English with id " + id + " has been deleted success";
	}

//	------------------------------------------ standardCourseEnglishCategory --------------------------------------
	@PostMapping("/standardCourseEnglish/category")
	CourseStandardCategory standardCourseCategory(@RequestBody CourseStandardCategory specialCourseCategory) {
		return courseRepoForStandardCategory.save(specialCourseCategory);
	}

	@GetMapping("/standardCourseEnglish/category")
	List<CourseStandardCategory> getAllStandardCategory() {
		return courseRepoForStandardCategory.findAll();
	}

	@GetMapping("/standardCourseEnglish/category/{id}")
	CourseStandardCategory getAllStandardCategoryById(@PathVariable Long id) {
		return courseRepoForStandardCategory.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/standardCourseEnglish/category/{id}")
	CourseStandardCategory updateStandardCategory(@RequestBody CourseStandardCategory updateStandardCategory,
			@PathVariable Long id) {
		return courseRepoForStandardCategory.findById(id).map(user -> {
			user.setStandardCategory(updateStandardCategory.getStandardCategory());
			return courseRepoForStandardCategory.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/standardCourseEnglish/category/{id}")
	String deleteStandardCategory(@PathVariable Long id) {
		if (!courseRepoForStandardCategory.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForStandardCategory.deleteById(id);
		return "Standard Category id " + " has been deleted successfully.";
	}

//	----------------------------------------- academic English Second Lang  ---------------------------------------------------

	@PostMapping("/academicEnglishSecondLang")
	CourseModelForAcademicEnglish academicEnglishSecondLang(
			@RequestBody CourseModelForAcademicEnglish academicEnglishSecondLang) {
		return courseRepoForAcademic.save(academicEnglishSecondLang);
	}

	@GetMapping("/academicEnglishSecondLang")
	List<CourseModelForAcademicEnglish> getAcademicEnglishSecondLang() {
		return courseRepoForAcademic.findAll();
	}

	@GetMapping("/academicEnglishSecondLang/{id}")
	CourseModelForAcademicEnglish getAcademicEnglishSecondLangById(@PathVariable Long id) {
		return courseRepoForAcademic.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/academicEnglishSecondLang/{id}")
	CourseModelForAcademicEnglish updateAcademicEnglishSecondLang(
			@RequestBody CourseModelForAcademicEnglish updateAcademicEnglishSecondLang, @PathVariable Long id) {
		return courseRepoForAcademic.findById(id).map(user -> {
			user.setAcademicEnglishSecondLangFirstPara(
					updateAcademicEnglishSecondLang.getAcademicEnglishSecondLangFirstPara());
			user.setAcademicEnglishSecondLangSecondPara(
					updateAcademicEnglishSecondLang.getAcademicEnglishSecondLangSecondPara());
			return courseRepoForAcademic.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/academicEnglishSecondLang/{id}")
	String deleteAcademicEnglishSecondLang(@PathVariable Long id) {
		if (!courseRepoForAcademic.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForAcademic.deleteById(id);
		return "Academic English Second Lang with id " + id + " has been deleted success";
	}

//	----------------------------------------- academic English category ---------------------------------------------------
	@PostMapping("/academicEnglishSecondLang/category")
	CourseAcademicCategory academicCourseCategory(@RequestBody CourseAcademicCategory academicCourseCategory) {
		return courseReporForAcademicCategory.save(academicCourseCategory);
	}

	@GetMapping("/academicEnglishSecondLang/category")
	List<CourseAcademicCategory> getAllAcademicCategories() {
		return courseReporForAcademicCategory.findAll();
	}

	@GetMapping("/academicEnglishSecondLang/category/{id}")
	CourseAcademicCategory getAllAcademicCategoryById(@PathVariable Long id) {
		return courseReporForAcademicCategory.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/academicEnglishSecondLang/category/{id}")
	CourseAcademicCategory updateAcademicCategory(@RequestBody CourseAcademicCategory updateAcademicCategory,
			@PathVariable Long id) {
		return courseReporForAcademicCategory.findById(id).map(user -> {
			user.setAcademicCategory(updateAcademicCategory.getAcademicCategory());
			return courseReporForAcademicCategory.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/academicEnglishSecondLang/category/{id}")
	String deleteAcademicCategory(@PathVariable Long id) {
		if (!courseReporForAcademicCategory.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseReporForAcademicCategory.deleteById(id);
		return "Academic Category id " + " has been deleted successfully.";
	}

//	---------------------------------------- business English Second Lang ------------------------------------------------

	@PostMapping("/businessEnglishSecondLang")
	CourseModelForBusiness businessEnglishSecondLang(@RequestBody CourseModelForBusiness businessEnglishSecondLang) {
		return courseRepoForBusiness.save(businessEnglishSecondLang);
	}

	@GetMapping("/businessEnglishSecondLang")
	List<CourseModelForBusiness> getBusinessEnglishSecondLang() {
		return courseRepoForBusiness.findAll();
	}

	@GetMapping("/businessEnglishSecondLang/{id}")
	CourseModelForBusiness getBusinessEnglishSecondLangById(@PathVariable Long id) {
		return courseRepoForBusiness.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/businessEnglishSecondLang/{id}")
	CourseModelForBusiness updateBusinessEnglishSecondLang(
			@RequestBody CourseModelForBusiness updateBusinessEnglishSecondLang, @PathVariable Long id) {
		return courseRepoForBusiness.findById(id).map(user -> {
			user.setBusinessEnglishSecondLangFirstPara(
					updateBusinessEnglishSecondLang.getBusinessEnglishSecondLangFirstPara());
			user.setBusinessEnglishSecondLangSecondPara(
					updateBusinessEnglishSecondLang.getBusinessEnglishSecondLangSecondPara());
			return courseRepoForBusiness.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/businessEnglishSecondLang/{id}")
	String deleteBusinessEnglishSecondLang(@PathVariable Long id) {
		if (!courseRepoForBusiness.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForBusiness.deleteById(id);
		return "business English Second Lang with id " + id + " has been deleted success";
	}

//	---------------------------------------- business English Category ------------------------------------------------

	@PostMapping("/businessEnglishSecondLang/category")
	CourseBusinessCategory businessCourseCategory(@RequestBody CourseBusinessCategory academicCourseCategory) {
		return courseRepoForBusinessCategory.save(academicCourseCategory);
	}

	@GetMapping("/businessEnglishSecondLang/category")
	List<CourseBusinessCategory> getAllBusinesscCategories() {
		return courseRepoForBusinessCategory.findAll();
	}

	@GetMapping("/businessEnglishSecondLang/category/{id}")
	CourseBusinessCategory getAllBusinessCategoryById(@PathVariable Long id) {
		return courseRepoForBusinessCategory.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/businessEnglishSecondLang/category/{id}")
	CourseBusinessCategory updateBusinessCategory(@RequestBody CourseBusinessCategory updateBusinessCategory,
			@PathVariable Long id) {
		return courseRepoForBusinessCategory.findById(id).map(user -> {
			user.setBusinessCategory(updateBusinessCategory.getBusinessCategory());
			return courseRepoForBusinessCategory.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/businessEnglishSecondLang/category/{id}")
	String deleteBusinessCategory(@PathVariable Long id) {
		if (!courseRepoForBusinessCategory.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForBusinessCategory.deleteById(id);
		return "Business Category id " + " has been deleted successfully.";
	}
//	-------------------------------------------------- mini English ------------------------------------------------------- 

	@PostMapping("/miniEnglish")
	CourseModelForMini miniEnglish(@RequestBody CourseModelForMini miniEnglish) {
		return courseRepoForMini.save(miniEnglish);
	}

	@GetMapping("/miniEnglish")
	List<CourseModelForMini> getMiniEnglish() {
		return courseRepoForMini.findAll();
	}

	@GetMapping("/miniEnglish/{id}")
	CourseModelForMini getMiniEnglishById(@PathVariable Long id) {
		return courseRepoForMini.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/miniEnglish/{id}")
	CourseModelForMini updateMiniEnglish(@RequestBody CourseModelForMini updateMiniEnglish, @PathVariable Long id) {
		return courseRepoForMini.findById(id).map(user -> {
			user.setMiniEnglishFirstPara(updateMiniEnglish.getMiniEnglishFirstPara());
			return courseRepoForMini.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/miniEnglish/{id}")
	String deleteMiniEnglish(@PathVariable Long id) {
		if (!courseRepoForMini.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForMini.deleteById(id);
		return "Mini English with id " + id + " has been deleted success";
	}

//	-------------------------------------------------- mini English Category ------------------------------------------------------- 

	@PostMapping("/miniEnglish/category")
	CourseMiniEnglishCategory miniEnglishCourseCategory(
			@RequestBody CourseMiniEnglishCategory MiniEnglishCourseCategory) {
		return courseRepoForMiniEnglishCategory.save(MiniEnglishCourseCategory);
	}

	@GetMapping("/miniEnglish/category")
	List<CourseMiniEnglishCategory> getAllMiniEnglishCategories() {
		return courseRepoForMiniEnglishCategory.findAll();
	}

	@GetMapping("/miniEnglish/category/{id}")
	CourseMiniEnglishCategory getAllMiniEnglishCategoryById(@PathVariable Long id) {
		return courseRepoForMiniEnglishCategory.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/miniEnglish/category/{id}")
	CourseMiniEnglishCategory updateBusinessCategory(@RequestBody CourseMiniEnglishCategory updateMiniEnglishCategory,
			@PathVariable Long id) {
		return courseRepoForMiniEnglishCategory.findById(id).map(user -> {
			user.setMiniEnglishCategory(updateMiniEnglishCategory.getMiniEnglishCategory());
			return courseRepoForMiniEnglishCategory.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/miniEnglish/category/{id}")
	String deleteMiniCategory(@PathVariable Long id) {
		if (!courseRepoForMiniEnglishCategory.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForMiniEnglishCategory.deleteById(id);
		return "Mini English Category id " + " has been deleted successfully.";
	}
//	-------------------------------------------------- proof Reading ------------------------------------------------------

	@PostMapping("/proofReading")
	CourseModelForProof proofReading(@RequestBody CourseModelForProof proofReading) {
		return courseRepoForProof.save(proofReading);
	}

	@GetMapping("/proofReading")
	List<CourseModelForProof> getProofReading() {
		return courseRepoForProof.findAll();
	}

	@GetMapping("/proofReading/{id}")
	CourseModelForProof getProofReadingById(@PathVariable Long id) {
		return courseRepoForProof.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/proofReading/{id}")
	CourseModelForProof updateProofReading(@RequestBody CourseModelForProof updateProofReading, @PathVariable Long id) {
		return courseRepoForProof.findById(id).map(user -> {
			user.setProofReadingFirstPara(updateProofReading.getProofReadingFirstPara());
			user.setProofReadingSecondPara(updateProofReading.getProofReadingSecondPara());
			user.setProofReadingThridPara(updateProofReading.getProofReadingThridPara());
			return courseRepoForProof.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/proofReading/{id}")
	String deleteProofReading(@PathVariable Long id) {
		if (!courseRepoForProof.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForProof.deleteById(id);
		return "Proof Reading with id " + id + " has been deleted success";
	}

//	-------------------------------------------------- proof Reading category ------------------------------------------------------
	@PostMapping("/proofReading/category")
	CourseProofReadingCategory proofReadingCourseCategory(
			@RequestBody CourseProofReadingCategory proofReadingCourseCategory) {
		return courseRepoForProofReadingCategory.save(proofReadingCourseCategory);
	}

	@GetMapping("/proofReading/category")
	List<CourseProofReadingCategory> getAllProofReadingCategories() {
		return courseRepoForProofReadingCategory.findAll();
	}

	@GetMapping("/proofReading/category/{id}")
	CourseProofReadingCategory getProofReadingCategoryById(@PathVariable Long id) {
		return courseRepoForProofReadingCategory.findById(id).orElseThrow(() -> new UserNotFoundException(id));
	}

	@PutMapping("/proofReading/category/{id}")
	CourseProofReadingCategory updateProofReadingCategory(
			@RequestBody CourseProofReadingCategory updateProofReadingCategory, @PathVariable Long id) {
		return courseRepoForProofReadingCategory.findById(id).map(user -> {
			user.setProofReadingCategory(updateProofReadingCategory.getProofReadingCategory());
			return courseRepoForProofReadingCategory.save(user);
		}).orElseThrow(() -> new UserNotFoundException(id));
	}

	@DeleteMapping("/proofReading/category/{id}")
	String deleteProofReadingCategory(@PathVariable Long id) {
		if (!courseRepoForProofReadingCategory.existsById(id)) {
			throw new UserNotFoundException(id);
		}
		courseRepoForProofReadingCategory.deleteById(id);
		return "ProofReading Category id " + " has been deleted successfully.";
	}
}
