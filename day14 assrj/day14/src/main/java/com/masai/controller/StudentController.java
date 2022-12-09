package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {

	private StudentService ser;
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student stud){
		
		return new ResponseEntity<Student>(ser.addStudent(stud), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Student> addStudent(@RequestParam Integer id) throws StudentException{
		
		return new ResponseEntity<Student>(ser.deleteStudent(id), HttpStatus.OK);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student stud) throws StudentException{
		
		return new ResponseEntity<Student>(ser.updateStudent(stud), HttpStatus.OK);
		
	}
	
	@GetMapping("/getStudent/{id}")
	public ResponseEntity<Student> getStudent(@RequestParam Integer id) throws StudentException{
		
		return new ResponseEntity<Student>(ser.deleteStudent(id), HttpStatus.OK);
		
	}
}
