package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Employee;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eser;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		  Employee e =  eser.addEmployee(emp);
		  
		  return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp){
		  Employee e =  eser.updateEmployee(emp);
		  
		  return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{eid}")
	public ResponseEntity<Employee> updateEmployee(@RequestParam Integer eid){
		  Employee e =  eser.deleteEmployee(eid);
		  
		  return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}

	@GetMapping("/getEmp/{eid}")
	public ResponseEntity<Employee> geteEmployee(@RequestParam Integer eid){
		  Employee e =  eser.getEmployeeById(eid);
		  
		  return new ResponseEntity<Employee>(e, HttpStatus.OK);
	}
}
