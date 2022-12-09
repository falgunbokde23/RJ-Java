package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.access.exceptions.AdminException;
import com.masai.access.exceptions.LoginException;
import com.masai.model.Course;
import com.masai.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService ser;
	
	@PostMapping("/course/{key}")
	public ResponseEntity<Course> addCourse(@RequestBody Course cour, @RequestParam String key) throws AdminException, LoginException{
		   
		return new ResponseEntity<Course>(ser.addCourse(cour,key), HttpStatus.OK);
	}
	
	@DeleteMapping("/course/{id}/{key}")
	public ResponseEntity<Course> deleteCourse(@RequestParam Integer id,  @RequestParam String key) throws AdminException, LoginException{
		   
		return new ResponseEntity<Course>(ser.deleteCourse(id,key), HttpStatus.OK);
	}

}
