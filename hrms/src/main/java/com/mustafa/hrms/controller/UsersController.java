package com.mustafa.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafa.hrms.business.abstracts.UserService;
import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	@Autowired
	private UserService userService;

	@GetMapping("/getall")
	public DataResult<List<User>> getAll() {
		return userService.getAll();
	}

	@GetMapping("/getByEmail")
	public DataResult<User> getByEmail(String email) {
		return userService.getByEmail(email);

	}

	@PostMapping("/addUser")
	public Result add(User user) {
		return userService.add(user);

	}

	@PostMapping("/verify")
	public Result verify(String email, String verifyCode) {
		return userService.verifyUser(email, verifyCode);
	}
}
