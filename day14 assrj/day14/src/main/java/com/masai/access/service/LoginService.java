package com.masai.access.service;

import com.masai.access.exceptions.LoginException;
import com.masai.access.models.AdminDto;
import com.masai.access.models.UserDto;

public interface LoginService {
	
	public String loginAdmin(AdminDto admin) throws LoginException;
	
	public String loginUser(UserDto user) throws LoginException;
	
	public String logoutAdmin(String key) throws LoginException;

	public String logoutUser(String key) throws LoginException;
	
	
}
