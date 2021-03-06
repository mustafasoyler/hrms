package com.mustafa.hrms.entites.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeForRegisterDtos {
	private String firstName;
	private String lastName;
	private String nationalityId;
	private Date dateOfBirth;
	private String email;
	private String password;
	private String verifyPassword;
}