package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Employee;
import com.masai.repositery.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo erepo;

	@Override
	public Employee addEmployee(Employee emp) {
	return erepo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
	Optional<Employee> empl = erepo.findById(emp.getId());
	
	if(empl.isPresent()) {
		
		Employee presentEmp =  empl.get();
		
		return erepo.save(emp);
	}
	return emp;
	
	}

	@Override
	public Employee deleteEmployee(Integer eid) {
		Optional<Employee> empl = erepo.findById(eid);
		
		if(empl.isPresent()) {
			 Employee e =  empl.get();
			erepo.delete(e);
			
			return e;
		}
		return null;
		
	}

	@Override
	public Employee getEmployeeById(Integer eid) {
		Optional<Employee> empl = erepo.findById(eid);
		
		if(empl.isPresent()) {
			  Employee e =   empl.get();
			  return e;
		}
		return null;
	}
	
	
	

}
