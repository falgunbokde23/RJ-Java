package com.masai.service;

import com.masai.access.exceptions.AdminException;
import com.masai.access.exceptions.LoginException;
import com.masai.model.Course;

public interface CourseService {

	public Course addCourse(Course cour, String key) throws AdminException, LoginException;
	public Course deleteCourse(Integer id, String key)throws AdminException, LoginException;;
}
