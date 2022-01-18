package com.bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bs.bean.User;
import com.bs.service.UserImpl;
import com.bs.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserImpl myService;

	@GetMapping("/userr")
	public User get() {
		return new User(12, "ganu", "ddu", 25, "aa@gmail.com", "M", "werw3w", "werw3w", "Guest", 3216549878L);
	}

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return myService.saveUser(user);
	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return myService.updateUser(user);
	}

	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") int userId) {
		return myService.getUser(userId);
	}

	@GetMapping("/getAllUser")
	public List<User> getAllUsers() {
		return myService.getAllUsers();
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int userId) {
		return myService.deleteUser(userId);
	}

}