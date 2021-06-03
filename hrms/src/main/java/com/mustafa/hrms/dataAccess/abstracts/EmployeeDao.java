package com.mustafa.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustafa.hrms.entites.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
	Employee findByNationalityId(String nationalityId);
}
