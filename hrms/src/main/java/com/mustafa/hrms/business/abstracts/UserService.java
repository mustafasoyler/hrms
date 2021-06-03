package com.mustafa.hrms.business.abstracts;

import java.util.List;

import com.mustafa.hrms.core.results.DataResult;
import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.entites.User;

public interface UserService {
	DataResult<List<User>> getAll();
	DataResult<User> getByEmail(String email);
	Result add(User user);
	Result verifyUser(String email,String verificationCode);
}