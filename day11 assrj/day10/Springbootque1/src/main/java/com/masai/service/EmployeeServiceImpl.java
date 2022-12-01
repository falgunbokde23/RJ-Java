package com.masai.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.exception.EmployeeException;
import com.masai.model.Emplyees;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo br;

	@Override
	public List<Emplyees> viewAllEmp() throws EmployeeException {
		 Optional<Emplyees> opt = br.findById(BookId);
			if(opt.isPresent()) {
				throw new EmployeeException("Book is not registerd ");
			}
			else
			 return opt.get();
	}

	@Override
	public Emplyees viewEmpById(int empId) throws EmployeeException {
		 List<Emplyees> empList = br.findAll();
	        
	        if(empList.size()==0) {
	        	
	        	throw new EmployeeException("No books available");
	        	
	        }else {
	        	return empList;
	        	
	        	
	        }
	}
	
	
}
