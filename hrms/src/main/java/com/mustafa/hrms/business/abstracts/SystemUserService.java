package com.mustafa.hrms.business.abstracts;

import java.util.List;

import com.mustafa.hrms.entites.SystemUser;

public interface SystemUserService {
	   List<SystemUser> getAll();
}