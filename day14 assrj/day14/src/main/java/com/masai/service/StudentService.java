package com.masai.service;

import com.masai.exception.StudentException;
import com.masai.model.Student;

public interface StudentService {
	
	public Student addStudent(Student stud);
	public Student deleteStudent(Integer id) throws StudentException;
    public Student updateStudent(Student stud) throws StudentException;
    public Student getStudent(Integer id) throws StudentException;
}
