package com.mustafa.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafa.hrms.business.abstracts.SystemUserService;
import com.mustafa.hrms.entites.SystemUser;

@RestController
@RequestMapping("/api/systemusers")
public class SystemUsersController {

	@Autowired
	private SystemUserService systemUserService;

	@GetMapping("/getall")
	public List<SystemUser> getAll() {
		return systemUserService.getAll();
	}

}