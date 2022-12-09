package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.access.dao.CurrentUserSessionRepo;
import com.masai.access.exceptions.AdminException;
import com.masai.access.exceptions.LoginException;
import com.masai.access.models.CurrentUserSession;
import com.masai.model.Course;
import com.masai.repositery.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo crepo;

	@Autowired
	private CurrentUserSessionRepo csdao;

	@Override
	public Course addCourse(Course cour, String key) throws AdminException, LoginException {
		CurrentUserSession loggedInUser = csdao.findByUuid(key);

		if (loggedInUser == null) {
			throw new LoginException("Invalid Key Entered");
		}

		if (loggedInUser.getAdmin() == false) {
			throw new AdminException("Unauthorized Access! Only Admin can make changes");
		}
		
		return crepo.save(cour);
	}


	@Override
	public Course deleteCourse(Integer id, String key) throws AdminException, LoginException {
		
		CurrentUserSession loggedInUser = csdao.findByUuid(key);

		if (loggedInUser == null) {
			throw new LoginException("Invalid Key Entered");
		}

		if (loggedInUser.getAdmin() == false) {
			throw new AdminException("Unauthorized Access! Only Admin can make changes");
		}
		
		  Optional<Course> c =  crepo.findById(id);
		  if(c.isPresent()) {
			  crepo.delete(c.get());
			  return c.get();
		  }
		  
		  return null;
	}

}
