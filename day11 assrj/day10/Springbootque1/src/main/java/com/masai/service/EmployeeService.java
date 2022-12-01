package com.masai.service;

import java.util.List;
import com.masai.exception.EmployeeException;
import com.masai.model.Emplyees;

public interface EmployeeService {

	public List<Emplyees> viewAllEmp() throws EmployeeException;
	
	public Emplyees viewEmpById(int empId)throws EmployeeException;
	
	
	
}
