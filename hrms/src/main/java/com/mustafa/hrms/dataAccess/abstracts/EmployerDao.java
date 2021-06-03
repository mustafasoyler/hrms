package com.mustafa.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustafa.hrms.entites.Employer;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
