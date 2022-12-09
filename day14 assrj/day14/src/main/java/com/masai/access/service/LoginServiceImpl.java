package com.masai.access.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.access.dao.AdminRepo;
import com.masai.access.dao.CurrentUserSessionRepo;
import com.masai.access.dao.UserRepo;
import com.masai.access.exceptions.LoginException;
import com.masai.access.models.AdminDto;
import com.masai.access.models.CurrentUserSession;
import com.masai.access.models.UserDto;
import com.masai.model.Admin;
import com.masai.model.User;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdminRepo adminRepo;

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private CurrentUserSessionRepo currUserSession;

	@Override
	public String loginAdmin(AdminDto admin) throws LoginException {

		Admin existingUser = adminRepo.findByAdminUsername(admin.getAdminUsername());

		if (existingUser == null)
			throw new LoginException("Invalid credentials. Username does not exist " + admin.getAdminUsername());

		Optional<CurrentUserSession> validCustomerSessionOpt = currUserSession.findById(existingUser.getAdminId());

		if (validCustomerSessionOpt.isPresent()) {

			throw new LoginException("User already Logged In with this username");

		}

		if (existingUser.getAdminPassword().equals(admin.getAdminPassword())) {

			String key = RandomString.make(6);

			Boolean isAdmin = true;

			CurrentUserSession currentUserSession = new CurrentUserSession(existingUser.getAdminId(), key, isAdmin,
					LocalDateTime.now());

			currUserSession.save(currentUserSession);

			return currentUserSession.toString();
		} else
			throw new LoginException("Please Enter a valid password");

	}

	@Override
	public String loginUser(UserDto user) throws LoginException {

		User existingUser = userRepo.findByUserName(user.getUserName());

		if (existingUser == null)
			throw new LoginException("Invalid credentials. Username does not exist " + user.getUserName());

		Optional<CurrentUserSession> validCustomerSessionOpt = currUserSession.findById(existingUser.getUserLoginId());

		if (validCustomerSessionOpt.isPresent()) {

			throw new LoginException("User already Logged In with this username");

		}

		if (existingUser.getPassword().equals(user.getPassword())) {

			String key = RandomString.make(6);
			
			Boolean isAdmin = false;

			CurrentUserSession currentUserSession = new CurrentUserSession(existingUser.getUserLoginId(), key, isAdmin,
					LocalDateTime.now());

			currUserSession.save(currentUserSession);

			return currentUserSession.toString();
		} else
			throw new LoginException("Please Enter a valid password");
	}

	@Override
	public String logoutAdmin(String key) throws LoginException {

		CurrentUserSession validCustomerSession = currUserSession.findByUuid(key);

		if (validCustomerSession == null) {
			throw new LoginException("User Not Logged In with this username");

		}

		currUserSession.delete(validCustomerSession);

		return "Logged Out !";
	}

	@Override
	public String logoutUser(String key) throws LoginException {

		CurrentUserSession validCustomerSession = currUserSession.findByUuid(key);

		if (validCustomerSession == null) {
			throw new LoginException("User Not Logged In with this username");

		}

		currUserSession.delete(validCustomerSession);

		return "Logged Out !";
	}

}
