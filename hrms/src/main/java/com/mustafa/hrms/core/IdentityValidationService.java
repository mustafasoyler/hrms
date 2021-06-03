package com.mustafa.hrms.core;

import com.mustafa.hrms.core.results.Result;

public interface IdentityValidationService {
	   Result validate(String tckn, String firstName, String lastName, int yearOfDate);
	}