package com.mustafa.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mustafa.hrms.entites.JobAdvertisement;

@Repository
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	 List<JobAdvertisement> findByIsActiveTrue();
     List<JobAdvertisement> findByIsActiveTrueOrderByCreateDate();
     List<JobAdvertisement> findByIsActiveTrueAndEmployer_UserId(int userId);
     JobAdvertisement findByIdAndEmployer_UserId(int id, int userId);

}
