package com.mustafa.hrms.business.abstracts;

import java.util.List;

import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.Employee;
import com.mustafa.hrms.entites.dtos.EmployeeForRegisterDtos;

public interface EmployeeService {
    DataResult<List<Employee>> getAll();
    Result register(EmployeeForRegisterDtos employee);
}