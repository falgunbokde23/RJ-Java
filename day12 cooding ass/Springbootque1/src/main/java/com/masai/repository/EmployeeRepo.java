package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Emplyees;

@Repository
public interface EmployeeRepo extends JpaRepository<Emplyees, Integer>{

}
