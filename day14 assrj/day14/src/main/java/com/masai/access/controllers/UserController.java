package com.masai.access.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.access.exceptions.LoginException;
import com.masai.access.exceptions.UserException;
import com.masai.access.service.UserService;
import com.masai.model.User;

//import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/userController")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users/{username}")
	public ResponseEntity<User> getUserDetailsHandler(@PathVariable String username) throws UserException {

		User existingUser = userService.findByUserName(username);

		return new ResponseEntity<User>(existingUser, HttpStatus.OK);

	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUserDetailsHandler() throws UserException {

		List<User> userList = userService.findAllUsers();

		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);

	}

	@PostMapping("/users")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user) throws UserException {

		User savedUser = userService.saveUser(user);

		return new ResponseEntity<User>(savedUser, HttpStatus.OK);

	}

	@PutMapping("/users")
	public ResponseEntity<User> updateUserHandler(@RequestBody User user, @RequestParam("key") String key)
			throws UserException, LoginException {

		User updatedUser = userService.updateUser(user, key);

		return new ResponseEntity<User>(updatedUser, HttpStatus.OK);

	}

	@DeleteMapping("/users/{username}")
	public ResponseEntity<User> deleteUserHandler(@PathVariable("username") String username)
			throws UserException, LoginException {

		User updatedUser = userService.deleteUser(username);

		return new ResponseEntity<User>(updatedUser, HttpStatus.OK);

	}

}
