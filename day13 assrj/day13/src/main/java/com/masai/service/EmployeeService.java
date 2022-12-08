package com.masai.service;

import com.masai.model.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public Employee deleteEmployee(Integer eid);
    public Employee getEmployeeById(Integer eid);
}
