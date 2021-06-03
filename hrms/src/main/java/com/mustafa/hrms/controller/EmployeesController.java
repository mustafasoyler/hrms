package com.mustafa.hrms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafa.hrms.business.abstracts.EmployeeService;
import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.Employee;
import com.mustafa.hrms.entites.dtos.EmployeeForRegisterDtos;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll(){
		return employeeService.getAll();
	}
	
	@PostMapping("/register")
	public Result add(@RequestBody EmployeeForRegisterDtos employee) {
		return this.employeeService.register(employee);
	}
	
}
