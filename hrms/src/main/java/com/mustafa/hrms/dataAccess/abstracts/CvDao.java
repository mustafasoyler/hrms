package com.mustafa.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mustafa.hrms.entites.Cv;

public interface CvDao extends JpaRepository<Cv,Integer> {
    Cv findById(int id);
   
}