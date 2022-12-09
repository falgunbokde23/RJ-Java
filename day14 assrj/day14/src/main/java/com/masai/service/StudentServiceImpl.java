package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.repositery.CourseRepo;
import com.masai.repositery.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo srepo;
	
	@Autowired
	private CourseRepo crepo;

	@Override
	public Student addStudent(Student stud) {
		   stud.setCourse(stud.getCourse());
		 return  srepo.save(stud);
	}

	@Override
	public Student deleteStudent(Integer id) throws StudentException {
		 Optional<Student> stud =    srepo.findById(id);
		 if(stud.isPresent()) {
			 
			 srepo.delete(stud.get());
			 return stud.get();
		 }
		 throw new StudentException("No student present with this id " + id);
	}

	@Override
	public Student updateStudent(Student stud) throws StudentException {
		Optional<Student> student = srepo.findById(stud.getId());
		
		if(student.isPresent()) {
			
			Student presentStud =  student.get();
			
			return srepo.save(stud);
		}
		 throw new StudentException("No student present with this id "+ stud.getId());
		
		}

	@Override
	public Student getStudent(Integer id) throws StudentException {
		Optional<Student> student = srepo.findById(id);
		
		if(student.isPresent()) {
			return student.get();
		}
		throw new StudentException("No student found with this id "+  id);
	}
	

}
