package com.mustafa.hrms.business.abstracts;

import java.util.List;

import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.Employer;
import com.mustafa.hrms.entites.dtos.EmployerForRegisterDto;

public interface EmployerService {
   DataResult<List<Employer>> getAll();
   DataResult<Employer> getById(int id);
   Result register(EmployerForRegisterDto employer);
}