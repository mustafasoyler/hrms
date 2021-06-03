package com.mustafa.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustafa.hrms.entites.JobPosition;

@Repository	
public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{
	
	JobPosition findByPositionName(String positionName);
	JobPosition findById(int id);
}