package com.masai.access.service;

import java.util.List;

import com.masai.access.exceptions.AdminException;
import com.masai.access.exceptions.LoginException;
import com.masai.model.Admin;

public interface AdminService {

	public Admin saveUser(Admin user) throws AdminException;

	public Admin updateUser(Admin user, String key) throws AdminException, LoginException;

	public Admin deleteUser(String adminUsername) throws AdminException;

	public Admin findByAdminId(Integer adminId) throws AdminException;

	public Admin findByUserName(String adminUserName) throws AdminException;

	public List<Admin> findAllUsers() throws AdminException;
}
