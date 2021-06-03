package com.mustafa.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mustafa.hrms.business.abstracts.EmployerService;
import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.Employer;
import com.mustafa.hrms.entites.dtos.EmployerForRegisterDto;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	@Autowired
	private EmployerService employerService;

	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}

	@GetMapping("/getById")
	public DataResult<Employer> getById(@RequestParam int id){
		return this.employerService.getById(id);
		
	}
	@PostMapping("/register")
	public Result add(@RequestBody EmployerForRegisterDto employer) {
		return this.employerService.register(employer);
	}
}