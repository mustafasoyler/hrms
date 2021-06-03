package com.mustafa.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafa.hrms.entites.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
    User findByEmail(String email);
    User findByEmailAndEmailVerifyCode(String email, String emailVerifyCode);
}